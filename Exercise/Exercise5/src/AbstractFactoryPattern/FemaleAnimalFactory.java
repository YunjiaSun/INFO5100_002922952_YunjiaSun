package AbstractFactoryPattern;

public class FemaleAnimalFactory implements AbstractAnimalFactory {

    @Override
    public Animal giveDog() {
        return new FemaleDog();
    }

    @Override
    public Animal giveCat() {
        return new FemaleCat();
    }
}
