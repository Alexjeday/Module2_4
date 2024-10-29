package homework.homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        Ruler<Boat> boatRuler = (boat) -> boat.getLength();
        Ruler<Animal> animalRuler = (animal) -> animal.getBodylength() + animal.getTaillength();
        Boat boat = new Boat(25);
        Animal animal = new Animal(50, 25);
        System.out.println("Sum length boat is " + boatRuler.measure(boat));
        System.out.println("Sum length animal is " + animalRuler.measure(animal));
    }




}
