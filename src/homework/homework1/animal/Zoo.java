package homework.homework1.animal;

public class Zoo {
    private Animal animal1;
    private Animal animal2;
    private Animal animal3;

    public Zoo(Animal animal1, Animal animal2, Animal animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public Animal getAnimal1() {
        return animal1;
    }

    public Animal getAnimal2() {
        return animal2;
    }

    public Animal getAnimal3() {
        return animal3;
    }
}
