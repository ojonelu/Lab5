package animalhierarchy;

public class Main {
    public static void main(String[] args) {
        animalhierarchy.Animal[] animals = new animalhierarchy.Animal[6];

        animals[0] = new Mammal("Max", 5, 12.5, "Golden");
        animals[1] = new Dog("Buddy", "Golden Retriever");
        animals[2] = new Bird();
        animals[3] = new Pigeon("Walter", 2, 0.4, "Grey/Green", "Homing");
        animals[4] = new Fish("Finley", "Freshwater");
        animals[5] = new Blowfish("Puff", 3, 1.1, "Saltwater", 85);

        System.out.println("--- Iterating through the Animal array ---");
        for (animalhierarchy.Animal animal : animals) {
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
    }
}

