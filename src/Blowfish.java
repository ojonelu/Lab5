package animalhierarchy;

public class Blowfish extends Fish implements AnimalBehavior {
    private int spineCount;

    public Blowfish() {
        super();
        this.spineCount = 50;
    }

    public Blowfish(String name, int age, double weight, String waterType, int spineCount) {
        super(name, age, weight, waterType);
        this.spineCount = spineCount;
    }

    public Blowfish(String name, int spineCount) {
        super(name, "Oceanic");
        this.spineCount = spineCount;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Blowfish is crushing a crab shell.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " clicks its teeth together underwater.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " the Blowfish is sleeping near the ocean floor.");
    }

    @Override
    public void move() {
        System.out.println("Blowfish swims.");
    }

    public void puffUp() {
        System.out.println(getName() + " inflated to twice its size with " + spineCount + " spines showing!");
    }

    public int getSpineCount() { return spineCount; }
    public void setSpineCount(int spineCount) { this.spineCount = spineCount; }

    @Override
    public String toString() {
        return super.toString() + ", Spine Count: " + spineCount;
    }
}
