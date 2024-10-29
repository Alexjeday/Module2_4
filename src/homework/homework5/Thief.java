package homework.homework5;

import java.lang.reflect.Field;

public class Thief {
    private int money;

    public Thief(int money) {
        this.money = 0;
    }
    public void stealMoney(Bank bank) {
        try {
            Field bankMoneyField = bank.getClass().getDeclaredField("money");
            bankMoneyField.setAccessible(true);
            int bankMoney = (int) bankMoneyField.get(bank);
            this.money +=bankMoney;

            bankMoneyField.set(bank, 0);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Thief{" +
                "money=" + money +
                '}';
    }
}
