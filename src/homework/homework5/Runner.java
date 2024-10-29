package homework.homework5;

public class Runner {
    public static void main(String[] args) {
        Bank bank = new Bank(1500);
        Thief thief = new Thief(0);
        thief.stealMoney(bank);
        System.out.println(thief);
        System.out.println(bank);
    }
}
