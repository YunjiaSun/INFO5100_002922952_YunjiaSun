package AbstractFactoryPattern;

public abstract class Cat extends Animal{
    @Override
    public void call() {
        System.out.println("I am a cat!");
    }
}
