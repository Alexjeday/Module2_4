package lesson4;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Child child = new Child("Иван", "Иванов", 2020);
        Child child2 = new Child("Даша", "Иванова", 2021);
        Child child3 = new Child("Мира", "Мирнова", 2020);
        Child child4 = new Child("Сергей", "Серегин", 2022);
        Child child5 = new Child("Саша", "Александров", 2021);
        Child child6 = new Child("Коля", "Костин", 2022);
        ChildGarden childGarden = new ChildGarden(3);
        childGarden.addChild(child);
        childGarden.addChild(child2);
        childGarden.addChild(child3);
        childGarden.addChild(child4);
        childGarden.addChild(child5);
        childGarden.addChild(child6);
        for (List<Child> group : childGarden.getGroups()) {
            System.out.println("Группа");
            System.out.println(group);
            System.out.println("-------------------------------");
        }
        //for (int i = 0; i < ; i++) {



        //System.out.println(child.equals(child2));
    }
}

