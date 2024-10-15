package lesson1.ex4;

public abstract class Car {
    protected boolean isClean = false;

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isClean() {
        return isClean;
    }
}
