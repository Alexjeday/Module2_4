package lesson3.train;

public class Train {
    private WagonType wagonType;
    private Wagon first;
    private Wagon last;

    public Train(Wagon wagon) {
        this.wagonType = wagon.getWagonType();
       // this.number =
        this.first = wagon;
        this.last = wagon;
    }
}
