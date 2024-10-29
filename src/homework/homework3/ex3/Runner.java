package homework.homework3.ex3;

public class Runner {
    public static void main(String[] args) {

        Burnable<Uranium> atomicReactor = (uranium) -> {
            System.out.println("Green light around!");
        };
        Burnable<Wood> bonfire = (wood) -> {
            System.out.println("yellow - redlight around!");
        };

        Uranium uranium = new Uranium();
        Wood wood = new Wood();

        System.out.println("Burning uranium in AtomicReactor");
        atomicReactor.accept(uranium);
        System.out.println("Burning wood in bonfire");
        bonfire.accept(wood);

    }
}
