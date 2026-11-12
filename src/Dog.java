package animalhierarchy;

public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Mixed Breed";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, "Brown");
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Dog is crunching on bones.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " says: Woof Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is happily fetching a ball.");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}