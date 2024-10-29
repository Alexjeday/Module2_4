package homework.homework3.ex2;

public class Runner {
    public static void main(String[] args) {
        Divination<String> chamomile = (name) -> {
            return name.length() % 2 == 0 ? "yes" : "no";
        };

        String name = "Alexandr";
        System.out.println("Chamomile divination for name \"" + name + "\": " + chamomile.predict(name));
        name = "Maria";
        System.out.println("Chamomile divination for name \"" + name + "\": " + chamomile.predict(name));
        Divination<Human> grandmaDivination = (human) ->{
            return (human.getAge() + human.getHeight()) > 210 ? "yes" : "no";
            };
        Human person1 = new Human(20, 180);
        System.out.println("Grandma divination: " + grandmaDivination.predict(person1));

        Human person2 = new Human(25, 190);
        System.out.println("Grandma divination: " + grandmaDivination.predict(person2));
    }
}
