package animalhierarchy;

public class Fish extends Animal {
    private String waterType;

    public Fish() {
        super();
        this.waterType = "Saltwater";
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, String waterType) {
        super(name);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Fish is swallowing plankton.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the Fish makes a bubbling sound.");
    }

    public void swim() {
        System.out.println(getName() + " is swimming through the coral reef.");
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString() {
        return super.toString() + ", Water Type: " + waterType;
    }
}