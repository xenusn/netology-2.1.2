public class Main {
    public static void main(String[] args) {

        int cash = 100;
        int deposit = 1500;

        int bonus = deposit / 100;
        int account = cash + deposit + bonus;

        System.out.println("Баланс вашего счёта равен: " + account + ". Бонусами начисленно: " + bonus + " рублей");
    }
}