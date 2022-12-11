package AbstractFactoryPattern;

public class MaleAnimalFactory implements AbstractAnimalFactory {
    @Override
    public Animal giveDog() {
        return new MaleDog();
    }

    @Override
    public Animal giveCat() {
        return new MaleCat();
    }
}
