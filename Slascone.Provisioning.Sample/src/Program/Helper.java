package Program;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.LinkedList;
import java.util.List;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.Base64;

public class Helper {

    private static String SignatureKey = "NfEpJ2DFfgczdYqOjvmlgP2O/4VlqmRHXNE9xDXbqZcOwXTbH3TFeBAKKbEzga7D42bmxuQPK5gGEseNNpFRekd/Kf059rff/N4phalkP25zVqH3VZIOlmot4jEeNr0m";

	// This is the public key as it can be downloaded from the slascone portal as PEM file
	public static String SignaturePublicKey =

"""
-----BEGIN PUBLIC KEY-----
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwpigzm+cZIyw6x253YRD
mroGQyo0rO9qpOdbNAkE/FMSX+At5CQT/Cyr0eZTo2h+MO5gn5a6dwg2SYB/K1Yt
yuiKqnaEUfoPnG51KLrj8hi9LoZyIenfsQnxPz+r8XGCUPeS9MhBEVvT4ba0x9Ew
R+krU87VqfI3KNpFQVdLPaZxN4STTEZaet7nReeNtnnZFYaUt5XeNPB0b0rGfrps
y7drmZz81dlWoRcLrBRpkf6XrOTX4yFxe/3HJ8mpukuvdweUBFoQ0xOHmG9pNQ31
AHGtgLYGjbKcW4xYmpDGl0txfcipAr1zMj7X3oCO9lHcFRnXdzx+TTeJYxQX2XVb
hQIDAQAB
-----END PUBLIC KEY-----""";

	/// <summary>
    /// Get a unique device id
    /// </summary>
    /// <returns>UUID via string</returns>
	public static String GetUniqueDeviceId() throws IOException {
		String command = "wmic csproduct get UUID";
		List<String> output = new LinkedList<String>();

		Process SerNumProcess = Runtime.getRuntime().exec(command);
		BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

		// Read the "wmic" command output line by line (omit blank lines)
		String line = "";
		while ((line = sNumReader.readLine()) != null) {
			if (0 < line.length()) {
				output.add(line.trim());
			}
		}

		// First line is a header; the data we need is in the second line
		String MachineID = output.get(1);
		return MachineID;
	}

	/// <summary>
    /// Get the operating system
    /// </summary>
    /// <returns>Name of operating system</returns>
    public static String GetOperatingSystem() throws IOException {		
    	String os = System.getProperty("os.name") + " - " + System.getProperty("os.version");
        return os;
    } 

    public static Boolean IsSignatureValidSymmetricKey(byte[] responseBytes, String signatureHeader)
			throws IOException, NoSuchAlgorithmException, InvalidKeyException {

		Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		SecretKeySpec secret_key = new SecretKeySpec(SignatureKey.getBytes("UTF-8"), "HmacSHA256");
		sha256_HMAC.init(secret_key);

		String hashString = Hex.encodeHexString(sha256_HMAC.doFinal(responseBytes));

		return (signatureHeader == hashString);
	}

	public static Boolean IsSignatureValidAsymmetricKey(byte[] responseBytes, String signatureHeader)
			throws NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException, SignatureException {

		Signature signature = Signature.getInstance("SHA256withRSA");
		signature.initVerify(PublicKeyFromPemString(SignaturePublicKey));
		signature.update(responseBytes);
		byte[] signatureHeaderBytes = Base64.decodeBase64(signatureHeader);
		boolean signtureValid = signature.verify(signatureHeaderBytes);

		return signtureValid;
	}

	public static PublicKey PublicKeyFromPemString(String pemString)
			throws NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException, SignatureException {

		String pemData = pemString
				.replace("-----BEGIN PUBLIC KEY-----", "")
				.replace("-----END PUBLIC KEY-----", "")
				.replace(System.lineSeparator(), "")
				.trim();
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(Base64.decodeBase64(pemData));
		return keyFactory.generatePublic(keySpec);
	}

	public static void StoreToFile(String fileName, byte[] binaryContent) {
		// Write binary data to file
		try {
			File file = new File(fileName);
			java.io.FileOutputStream fos = new java.io.FileOutputStream(file);
			fos.write(binaryContent);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static byte[] ReadFromFile(String fileName) {
		// Read binary data from file
		try {
			File file = new File(fileName);
			java.io.FileInputStream fis = new java.io.FileInputStream(file);
			byte[] binaryContent = new byte[(int) file.length()];
			fis.read(binaryContent);
			fis.close();
			return binaryContent;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

    public static void RemoveFile(String string) {
		File file = new File(string);
		file.delete();
	}
}
