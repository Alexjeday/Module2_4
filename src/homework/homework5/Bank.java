package homework.homework5;

public class Bank {
    private int money;

    public Bank(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "money=" + money +
                '}';
    }
}
