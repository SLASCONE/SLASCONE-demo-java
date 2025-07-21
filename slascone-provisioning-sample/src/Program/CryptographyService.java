package Program;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

public class CryptographyService {

    /**
     * Validates a signature using a symmetric key (HMAC-SHA256).
     *
     * @param responseBytes The response data to validate
     * @param signatureHeader The signature value from the header
     * @return True if the signature is valid, false otherwise
     * @throws IOException If there's an error processing the bytes
     * @throws NoSuchAlgorithmException If the HMAC-SHA256 algorithm is not available
     * @throws InvalidKeyException If the key is invalid
     */
    public static Boolean IsSignatureValidSymmetricKey(byte[] responseBytes, String signatureHeader)
            throws IOException, NoSuchAlgorithmException, InvalidKeyException {

        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(Settings.SignatureKey.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);

        String hashString = Hex.encodeHexString(sha256_HMAC.doFinal(responseBytes));

        return (signatureHeader == hashString);
    }

    /**
     * Validates a signature using an asymmetric key (SHA256withRSA).
     *
     * @param responseBytes The response data to validate
     * @param signatureHeader The signature value from the header (Base64 encoded)
     * @return True if the signature is valid, false otherwise
     * @throws NoSuchAlgorithmException If the SHA256withRSA algorithm is not available
     * @throws InvalidKeyException If the key is invalid
     * @throws InvalidKeySpecException If the key specification is invalid
     * @throws SignatureException If there's an error processing the signature
     */
    public static Boolean IsSignatureValidAsymmetricKey(byte[] responseBytes, String signatureHeader)
            throws NoSuchAlgorithmException, InvalidKeyException, InvalidKeySpecException, SignatureException {

        Signature signature = Signature.getInstance("SHA256withRSA");
        PublicKey publicKey = PublicKeyFromPemString(Settings.SignaturePublicKey);

        signature.initVerify(publicKey);
        signature.update(responseBytes);
        byte[] signatureHeaderBytes = Base64.decodeBase64(signatureHeader);
        boolean signtureValid = signature.verify(signatureHeaderBytes);

        return signtureValid;
    }

    /**
     * Creates a PublicKey object from a PEM-formatted string.
     * 
     * @param pemString The PEM-formatted public key string
     * @return The PublicKey object
     * @throws NoSuchAlgorithmException If the RSA algorithm is not available
     * @throws InvalidKeyException If the key is invalid
     * @throws InvalidKeySpecException If the key specification is invalid
     * @throws SignatureException If there's an error processing the key
     */
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
}
