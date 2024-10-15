package homework.homework1.animal;

public class Runner {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Dog dog = new Dog();
        Bird bird = new Bird();
        Zoo zoo = new Zoo(tiger, dog, bird);

        if (zoo.getAnimal1() instanceof Tiger) {
            ((Tiger) zoo.getAnimal1()).roar();
        }
        if (zoo.getAnimal2() instanceof Dog) {
            ((Dog) zoo.getAnimal2()).bark();
        }
        if (zoo.getAnimal3() instanceof Bird) {
            ((Bird) zoo.getAnimal3()).fly();
        }
    }
}
