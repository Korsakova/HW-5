import java.util.*;

/**
 * @author Korsakova Anastasiya
 * Класс PetsCardIndex
 */

public class PetsCardIndex {
    final Map<Integer, Pet> index;
    final Map<String, Integer> forFindPetByName;

    // конструктор метода PetsCardIndex для инициал-и полей
    public PetsCardIndex() {
        // анонимный класс - унаследовались от HashMap
        this.index = new HashMap<Integer, Pet>() {
            @Override
            public Pet put(Integer key, Pet value) {
                final Pet put = super.put(key, value);
                forFindPetByName.put(value.getName(), key);
                return put;
            }

            @Override
            public Pet remove(Object key) {
                return super.remove(key);
            }
        };
        this.forFindPetByName = new HashMap<>();
    }

    // метод addPet, который добавляет животного в картотеку (учесть, что добавление дубликатов должно приводить к исключительной ситуации)
    public void addPet(Pet pet) {
        final int petId = pet.getId();

        if (index.containsKey(petId)) {
            throw new RuntimeException("Такое животное есть в картотеке:" + pet);
        }
        index.put(petId, pet);
    }

    // метод findPetByName, который осуществялет поиск животного по его кличке
    public Pet findPetByName(String name) {
        Integer id = forFindPetByName.get(name);
        return index.get(id);
    }

    // метод changePetById, который изменяет данные животного по его идентификатору
    public Pet changePetById(int id, String name, Person owner, Double weight) {
        final Pet pet = index.get(id);
        if (name != null) {
            forFindPetByName.remove(pet.getName());
            pet.setName(name);
            forFindPetByName.put(pet.getName(), pet.getId());
        }
        if (owner != null) {
            pet.setOwner(owner);
        }
        if (weight != null) {
            pet.setWeight(weight);
        }
        return pet;
    }

    // метод showOrderedPet, который выводит на экран список животных в отсортированном порядке. Поля для сортировки –  хозяин, кличка животного, вес.
    public void showOrderedPet() {
        final List<Pet> values = new ArrayList<>(index.values());
        values.sort(new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                int compare = o1.getOwner().compareTo(o2.getOwner());

                if (compare == 0) {
                    compare = o1.getName().compareTo(o2.getName());

                    if (compare == 0) {
                        compare = Double.compare(o1.getWeight(), o2.getWeight());
                    }
                }

                return compare;
            }
        });
        System.out.println(values);

    }

    public static void main(String[] args) {
        PetsCardIndex petsCardIndex = new PetsCardIndex();
        petsCardIndex.addPet(new Pet(1, "Вася", new Person(27, "woman", "Леля"), 25));
        petsCardIndex.addPet(new Pet(2, "Петя", new Person(60, "man", "Харли"), 10));
        petsCardIndex.addPet(new Pet(3, "Барсик", new Person(55, "man", "Лев"), 8));
        petsCardIndex.addPet(new Pet(4, "Лев", new Person(15, "man", "Майкл"), 12.5));

        System.out.println(petsCardIndex.findPetByName("Вася"));
        System.out.println(petsCardIndex.changePetById(3, null, null, 10.5));
        petsCardIndex.showOrderedPet();
    }


}
