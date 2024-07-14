/*
Polymorphism -- many forms
 */



public class Main {
    public static void main(String[] args) {
        //create an instance of Animal
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        //passing dog object as an argument into the method that waits the animal object
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish ("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    //static --> I want to call from main
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
    }
}
