
import java.security.InvalidKeyException;

import java.util.Base64;

import javax.crypto.*;

public class AESSecurity {

    private static final String ALGO = "AES";

    SecretKey secretKey = generateKey();
    Cipher c = Cipher.getInstance("AES");

    public AESSecurity() throws Exception {
    }


    public String encrypt(String Data) {

        try {
            c.init(Cipher.ENCRYPT_MODE,secretKey);
            byte[] encryptedTextToByte = c.doFinal(Data.getBytes());
            String encryptedValue = Base64.getEncoder().encodeToString(encryptedTextToByte);
            return encryptedValue;

        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        return "error";
    }

    public String decrypt(String encryptedData) throws Exception{

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] encryptedTextByte = decoder.decode(encryptedData);
        c.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedByte = c.doFinal(encryptedTextByte);
        String decryptedText = new String(decryptedByte);
        return decryptedText;


    }

    private SecretKey generateKey() throws Exception{
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGO);
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();
        return secretKey;
    }

}
