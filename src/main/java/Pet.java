import java.util.Objects;

/**
 * @author Korsakova Anastasiya
 * Класс Pet
 */


public class Pet {
    // поля класса Pet
    int id;
    String name;
    Person owner;
    double weight;


    // конструктор для полей класса Pet, проинициализировали поля класса Pet в конструкторе
    Pet(int id, String name, Person owner, double weight) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner, weight);
    }

    public boolean equals(Object o) {
        if (!(o instanceof Pet))
            return false;

        if (this == o)
            return true;

        Pet p = (Pet) o;

        if (this.id == p.id)
            return true;

        return (this.name != null && this.name.equals(p.name) || this.name == null && p.name == null) &&
                (this.owner != null && this.owner.equals(p.owner) || this.owner == null && p.owner == null) &&
                this.weight == p.weight;
    }
}
