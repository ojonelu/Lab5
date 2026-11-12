package animalhierarchy;
public interface AnimalMove {
    default void move() {
        System.out.printIn(this.getClass().getSimpleName() + " moves.");
    }
}
