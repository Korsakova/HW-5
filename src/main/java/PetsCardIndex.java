import java.util.Map;
import java.util.Set;

public class PetsCardIndex {
    Set<String> forAddPet;
    Map<String, Pet> forFindPetByName;
    Map<Integer, Pet> forChangePetById;

    // метод addPet, который добавляет животного в картотеку (учесть, что добавление дубликатов должно приводить к исключительной ситуации)
    public void addPet(String pet){
        forAddPet.add(pet);
    }

    // метод findPetByName, который осуществялет поиск животного по его кличке
    public String findPetByName(String name, Pet pet){
        forFindPetByName.get(name, pet);
        return name;
    }
    // метод changePetById, который изменяет данные животного по его идентификатору
    public int changePetById(int id){
        return void;
    }

    // метод showOrderedPet, который выводит на экран списка животных в отсортированном порядке. Поля для сортировки –  хозяин, кличка животного, вес.
    public void showOrderedPet(){
        System.out.println();

    }

    public static void main(String[] args) {
        PetsCardIndex petsCardIndex = new PetsCardIndex();
        System.out.println(petsCardIndex.showOrderedPet);
    }


}
