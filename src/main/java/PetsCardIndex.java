import java.util.Map;
import java.util.Set;

/**
 * @author Korsakova Anastasiya
 * Класс PetsCardIndex
 */

public class PetsCardIndex {
    Set<Pet> index;
    Map<String,Pet> forFindPetByName;
    Map<Integer, Pet> forChangePetById;


    // метод addPet, который добавляет животного в картотеку (учесть, что добавление дубликатов должно приводить к исключительной ситуации)
    public void addPet(Pet pet){
        if(index.contains(pet)){
            throw new RuntimeException("Такое животное есть в картотеке:" + pet);
        }
            index.add(pet);
    }

    // метод findPetByName, который осуществялет поиск животного по его кличке
    public Pet findPetByName(String name){
        return forFindPetByName.get(name);
    }

    // метод changePetById, который изменяет данные животного по его идентификатору
    public Pet changePetById(int id, String name, Person owner, double weight){





        PetsCardIndex newPetsCardIndex = new PetsCardIndex();
        newPetsCardIndex = int x;
        Pet newPet = new Pet (id, name, owner, weight);

        for(int i = 0; i =< newPetsCardIndex; i++){
            if(newPet.compareTo()){

            }
        }

        return ;
    }

    // метод showOrderedPet, который выводит на экран списка животных в отсортированном порядке. Поля для сортировки –  хозяин, кличка животного, вес.
    public void showOrderedPet(Person owner, String name, double weight){


        System.out.println(v.toString());

    }

    public static void main(String[] args) {
        PetsCardIndex petsCardIndex = new PetsCardIndex();
        System.out.println(petsCardIndex.showOrderedPet);
    }


}
