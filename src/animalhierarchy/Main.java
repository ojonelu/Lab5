package animalhierarchy;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Mammal("Max", 5, 12.5, "Golden");
        animals[1] = new Dog("Buddy", "Golden Retriever");
        animals[2] = new Bird();
        animals[3] = new Pigeon("Walter", 2, 0.4, "Grey/Green", "Homing");
        animals[4] = new Fish("Finley", "Freshwater");
        animals[5] = new Blowfish("Puff", 3, 1.1, "Saltwater", 85);

        System.out.println("--- Iterating through the Animal array ---");
        for (Animal animal : animals) {
            System.out.println("\n" + animal.toString());
            animal.eat();
            animal.getVoice();

            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Pigeon) {
                ((Pigeon) animal).deliverMessage();
            } else if (animal instanceof Blowfish) {
                ((Blowfish) animal).puffUp();
            } else if (animal instanceof Mammal) {
                ((Mammal) animal).nurseYoung();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }
        }

        System.out.println("\n--- Calling move() on each Animal ---");
        for (Animal animal : animals) {
            animal.move();
        }

        System.out.println("\n--- Calling AnimalName.name() on each Animal ---");
        for (Animal animal : animals) {
            AnimalName.name(animal.getName());
        }

        System.out.println("\n--- Calling sleep() via AnimalBehavior array ---");
        AnimalBehavior[] animalBehaviors = new AnimalBehavior[3];
        animalBehaviors[0] = new Dog("Buddy", "Golden Retriever");
        animalBehaviors[1] = new Pigeon("Walter", 2, 0.4, "Grey/Green", "Homing");
        animalBehaviors[2] = new Blowfish("Puff", 3, 1.1, "Saltwater", 85);

        animalBehaviors[0].sleep();
        animalBehaviors[1].sleep();
        animalBehaviors[2].sleep();
    }
}
