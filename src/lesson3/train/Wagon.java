package lesson3.train;

public class Wagon {
    private WagonType wagonType;
    private Wagon wagonprev;
    private Wagon wagonnext;

    public Wagon(WagonType wagonType) {
        this.wagonType = wagonType;
    }

    /**
     * Последний вагон.
     */
    public Wagon(Wagon wagonprev) {
        this.wagonprev = wagonprev;
    }


    /**
     *
     * Вагон находящийся между вагонами.
     */
    public Wagon(Wagon wagonprev, Wagon wagonnext) {
        this.wagonprev = wagonprev;
        this.wagonnext = wagonnext;
    }

    public WagonType getWagonType() {
        return wagonType;
    }
}
