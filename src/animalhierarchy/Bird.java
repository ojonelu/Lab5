package animalhierarchy;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Bird is pecking at seeds.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the Bird chirps.");
    }

    public void fly() {
        System.out.println(getName() + " is soaring through the sky.");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return super.toString() + ", Feather Color: " + featherColor;
    }
}