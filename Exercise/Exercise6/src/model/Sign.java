package model;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.Signature;

public class Sign{
    Signature signature;
    KeyPair keyPair;
    byte[] sign;

    public byte[] signatureVerification(String string) throws Exception{

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

        SecureRandom secureRandom = new SecureRandom();

        keyPairGenerator.initialize(2048,secureRandom);

        keyPair = keyPairGenerator.generateKeyPair();

        signature = Signature.getInstance("SHA256withRSA");

        signature.initSign(keyPair.getPrivate());

        sign = string.getBytes();

        signature.update(sign);

        byte[] signatureMessage = signature.sign();

        return signatureMessage;
    }

    public boolean signatureVerifyTest1(byte[] signatureMessage) throws Exception{

        signature.initVerify(keyPair.getPublic());
        signature.update(sign);
        return signature.verify(signatureMessage);
    }

    public boolean signatureVerifyTest2(byte[] signatureMessage) throws Exception{

        signature.initVerify(keyPair.getPublic());
        return signature.verify(signatureMessage);
    }

}
