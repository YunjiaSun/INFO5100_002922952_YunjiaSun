package model;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;


public class AES256 {
    Cipher cipher;
    SecretKey secretKey;

    public byte[] encryptAES(String string) throws Exception{

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");

        keyGenerator.init(256);

        secretKey = keyGenerator.generateKey();

        cipher = Cipher.getInstance("AES/GCM/NoPadding");

        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encryptedMessage = cipher.doFinal(string.getBytes());

        return  encryptedMessage;
    }

    public byte[] decryptAES(byte[] encryptedMessage) throws Exception{

        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(128, cipher.getIV());

        cipher.init(Cipher.DECRYPT_MODE,secretKey,gcmParameterSpec);

        byte[] decryptMessage = cipher.doFinal(encryptedMessage);

        return decryptMessage;
    }
}
