import java.util.Comparator;

/**
 * @author Korsakova Anastasiya
 * Класс Person
 */

public class Person implements Comparable<Person> {
    // поля класса Person
    int age;
    String sex;
    String name;

    // конструктор класса Person
    Person(int age , String sex, String name){
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int compareTo(Person p2) {

        // сравнение пола
        if(!this.sex.equals(p2.sex)){
            return this.sex.equals("man")? 1: -1;
        }
        // сравнение возраста
        if(this.age != p2.age){
            return this.age > p2.age? 1: -1;
        }

        // сравнение имен и возврат итогового сравнения
        return -this.name.compareTo(p2.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
