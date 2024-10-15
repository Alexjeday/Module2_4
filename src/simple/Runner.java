package simple;

public class Runner  {


    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>("one", 1);
        System.out.println("Key : " + box.getKey() + "\nMeaning : " + box.getValue());

        Dog dog = new Dog();
        dog.sleep();
        dog.sound();
    }
}
