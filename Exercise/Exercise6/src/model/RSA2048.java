package model;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;

public class RSA2048 {
    Cipher cipher;
    KeyPair keyPair;

    public byte[] encryptRSA(String string) throws Exception {

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

        SecureRandom secureRandom = new SecureRandom();

        keyPairGenerator.initialize(2048,secureRandom);

        keyPair = keyPairGenerator.generateKeyPair();

        cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());

        byte[] encryptedMessage = cipher.doFinal(string.getBytes());

        return  encryptedMessage;
    }

    public byte[] decryptRSA(byte[] encryptedMessage) throws Exception{

        cipher.init(Cipher.DECRYPT_MODE, keyPair.getPrivate());

        byte[] decryptedMessage = cipher.doFinal(encryptedMessage);

        return decryptedMessage;
    }
}
