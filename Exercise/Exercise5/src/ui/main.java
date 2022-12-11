package ui;

import AbstractFactoryPattern.AbstractAnimalFactory;
import AbstractFactoryPattern.FemaleAnimalFactory;
import AbstractFactoryPattern.MaleAnimalFactory;
import FactoryPattern.Animal;
import FactoryPattern.AnimalFactory;
import FactoryPattern.CatFactory;
import FactoryPattern.DogFactory;
import SingletonPattern.Singleton;

public class main {
    public static void main(String[] args){

        //Singleton
        System.out.println("--------------Singleton------------");
        Singleton map = Singleton.getInstance();
        map.build();

        //FactoryPattern
        System.out.println("-----------Factory Pattern---------");
        AnimalFactory animalFactory1 = new CatFactory();
        Animal cat = animalFactory1.creatAnimal();
        System.out.println("Customer wants a cat:");
        cat.call();

        AnimalFactory animalFactory2 = new DogFactory();
        Animal dog = animalFactory2.creatAnimal();
        System.out.println("Customer wants a dog:");
        dog.call();


        //AbstractFactoryPattern
        //Factories are abstract, products are abstract, create other factories around a gigafactory.
        System.out.println("-----------Abstract Factory Pattern---------");
        AbstractAnimalFactory abstractAnimalFactory = new FemaleAnimalFactory();
        System.out.println("Customer wants a female cat:");
        abstractAnimalFactory.giveCat().gender();

        AbstractAnimalFactory abstractAnimalFactory1 = new MaleAnimalFactory();
        System.out.println("Customer wants a male dog:");
        abstractAnimalFactory1.giveDog().gender();









    }
}
