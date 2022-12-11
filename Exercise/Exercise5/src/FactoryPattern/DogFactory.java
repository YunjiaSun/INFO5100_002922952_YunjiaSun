package FactoryPattern;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal creatAnimal() {
        return new Dog();
    }
}
