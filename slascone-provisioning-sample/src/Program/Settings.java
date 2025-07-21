package Program;

import java.util.UUID;

public class Settings {

    // ToDo: Insert the parameter for the respective function
    public static final String API_BASE_URL = "https://api.slascone.com";
    public static final String PROVISIONING_KEY = "NfEpJ2DFfgczdYqOjvmlgP2O/4VlqmRHXNE9xDXbqZcOwXTbH3TFeBAKKbEzga7D7ashHxFtZOR142LYgKWdNocibDgN75/P58YNvUZafLdaie7eGwI/2gX/XuDPtqDW";
    public static final UUID ISV_ID = UUID.fromString("2af5fe02-6207-4214-946e-b00ac5309f53");
    public static final String PRODUCT_ID = "b18657cc-1f7c-43fa-e3a4-08da6fa41ad3";

    public static final int SIGNATURE_VALIDATION_MODE = 2; // Default to asymmetric key validation

    public static final String SignatureKey = "NfEpJ2DFfgczdYqOjvmlgP2O/4VlqmRHXNE9xDXbqZcOwXTbH3TFeBAKKbEzga7D42bmxuQPK5gGEseNNpFRekd/Kf059rff/N4phalkP25zVqH3VZIOlmot4jEeNr0m";

    // This is the public key as it can be downloaded from the slascone portal as PEM file
    public static final String SignaturePublicKey =
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

}
