package ui;
import model.*;

public class main {
    public static void main(String[] args) throws Exception {

        //create alice and bob
        Alice alice = new Alice("Alice");
        Bob bob = new Bob("Bob");

        //Test1 AES256
        //encrypt alice message
        AES256 aes256 = new AES256();
        byte[] test1 = aes256.encryptAES(alice.message());
        System.out.println("--------------AES256--------------");
        System.out.println("This is the message from Alice :");
        System.out.println(new String(test1,"UTF8"));

        //bob decrypt message
        bob.print(new String(aes256.decryptAES(test1)));


        //Test2 RSA2048
        //encrypt alice message
        RSA2048 rsa2048 =new RSA2048();
        byte[] test2 = rsa2048.encryptRSA((alice.message()));
        System.out.println("--------------RSA2048--------------");
        System.out.println("This is the message from Alice :");
        System.out.println(new String(test2,"UTF8"));

        //bob decrypt message
        bob.print(new String(rsa2048.decryptRSA(test2)));


        //Test3 Signing
        Sign sign = new Sign();
        byte[] test3 = sign.signatureVerification(alice.message());
        System.out.println("----------------Sign---------------");
        System.out.println("This is the message from Alice :");
        System.out.println(new String(test3,"UTF8"));

        //signatureVerifyTest1
        if (sign.signatureVerifyTest1(test3)){
            bob.print("Alice signature verification succeeded");
        }else{
            bob.print("Alice signature verification failed.");
        }

        //signatureVerifyTest2
        if (sign.signatureVerifyTest2(test3)){
            bob.print("Alice signature verification succeeded");
        }else{
            bob.print("Alice signature verification failed.");
        }











    }
}
