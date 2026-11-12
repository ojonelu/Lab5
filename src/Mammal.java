package animalhierarchy;

public class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        super();
        this.furColor = "Unknown";
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Mammal is chewing food.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the Mammal makes a mammalian sound.");
    }

    public void nurseYoung() {
        System.out.println(getName() + " is nursing its young.");
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }
}