package AbstractFactoryPattern;

public abstract class Dog extends Animal{
    @Override
    public void call() {
        System.out.println("I am a dog!");
    }
}
