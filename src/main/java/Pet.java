public class Pet {
    // поля класса Pet
    int id;
    String name;
    Person owner;
    double weight;


    // конструктор для полей класса Pet, проинициализировали поля класса Pet в конструкторе
    Pet(int id, String name, Person owner, double weight){
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }

}
