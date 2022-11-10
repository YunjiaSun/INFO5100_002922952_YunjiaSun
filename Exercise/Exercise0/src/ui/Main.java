package ui;

import model.*;

public class Main {
    public static void main(String[] args){
        Backpack backpack1 = new Backpack("Nike","black","Single shoulder bag");
        Backpack backpack2 = new Backpack("Adidas","white","Single shoulder bag");
        Backpack backpack3 = new Backpack("Peek","black","Single shoulder bag");
        backpack1.printBackpackInfo();
        backpack2.printBackpackInfo();
        backpack3.printBackpackInfo();

        Camera camera1 = new Camera("Canon","white","SLR");
        Camera camera2 = new Camera("Nikon","red","digital");
        Camera camera3 = new Camera("SONY","white","SLR");
        camera1.printCameraInfo();
        camera2.printCameraInfo();
        camera3.printCameraInfo();

        Car car1 = new Car("red","X3","BMW");
        Car car2 = new Car("black","X5","BMW");
        Car car3 = new Car("white","X7","BMW");
        car1.printCarInfo();
        car2.printCarInfo();
        car3.printCarInfo();

        Chair chair1 = new Chair("Shanxia","China","green");
        Chair chair2 = new Chair("Fully","UK","pink");
        Chair chair3 = new Chair("Shanxia","American","red");
        chair1.printChairInfo();
        chair2.printChairInfo();
        chair3.printChairInfo();

        Desk desk1 = new Desk("Fully","European","blue","wood");
        Desk desk2 = new Desk("Shanxia","UK","grey","iron");
        Desk desk3 = new Desk("Fully","European","pink","wood");
        desk1.printDeskInfo();
        desk2.printDeskInfo();
        desk3.printDeskInfo();

        Laptop laptop1 = new Laptop("Apple","silver","American");
        Laptop laptop2 = new Laptop("HUAWEI","black","China");
        Laptop laptop3 = new Laptop("Apple","golden","American");
        laptop1.printLaptopInfo();
        laptop2.printLaptopInfo();
        laptop3.printLaptopInfo();

        Lipstick lipstick1 = new Lipstick("Chanel","China","red");
        Lipstick lipstick2 = new Lipstick("Dior","European","pink");
        Lipstick lipstick3 = new Lipstick("LV","European","red");
        lipstick1.printLipstickInfo();
        lipstick2.printLipstickInfo();
        lipstick3.printLipstickInfo();

        Pen pen1 = new Pen("Chenguang","black","pencil");
        Pen pen2 = new Pen("Chenguang","blue","Marker");
        Pen pen3 = new Pen("Chenguang","red","Marker");
        pen1.printPenInfo();
        pen2.printPenInfo();
        pen3.printPenInfo();

        Phone phone1 = new Phone("Apple","golden",700);
        Phone phone2 = new Phone("HUAWEI","black",400);
        Phone phone3 = new Phone("Apple","white",800);
        phone1.printPhoneInfo();
        phone2.printPhoneInfo();
        phone3.printPhoneInfo();

        Student student1 = new Student("Summer","0503","IS",27);
        Student student2 = new Student("Robin","0202","CS",28);
        Student student3 = new Student("Sam","6688","IS",22);
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();




    }
}
