# Exercise 8: Packages and Interfaces (Task 2)

Java Object-Oriented Programming project extending the multi-level `Animal` class hierarchy with interfaces and polymorphism.

## Project Structure
- **Interfaces**:
    - `AnimalBehavior`: Defines the abstract `sleep()` method implemented by `Dog`, `Pigeon`, and `Blowfish`.
    - `AnimalMove`: Defines a `default` `move()` method implemented by `Animal` and overridden in `Dog`, `Pigeon`, and `Blowfish`.
    - `AnimalName`: Defines a `static` `name(String name)` method called directly via the interface.
- **Class Hierarchy**:
    - `Animal` (abstract) → `Mammal` → `Dog`
    - `Animal` (abstract) → `Bird` → `Pigeon`
    - `Animal` (abstract) → `Fish` → `Blowfish`
- **Main**: Demonstrates polymorphism across `Animal[]` and `AnimalBehavior[]` arrays using `foreach` loops and interface method calls.
