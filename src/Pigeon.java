package animalhierarchy;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "City Pigeon";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "Grey");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Pigeon is eating breadcrumbs in the park.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " says: Coo Coo!");
    }

    public void deliverMessage() {
        System.out.println(getName() + " is carrying a homing message.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return super.toString() + ", Species: " + species;
    }
}