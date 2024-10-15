package lesson3.train;

public class Runner {
    public static void main(String[] args) {
        Wagon wagon = new Wagon(WagonType.PASSENGER);
        Train train = new Train(wagon);
        Wagon wagon2 = new Wagon(WagonType.PASSENGER);
        //Train train = new Train(wagon2);
    }
}
