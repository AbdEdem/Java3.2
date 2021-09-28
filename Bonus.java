public class Bonus {
    public static void main(String[] args) {
        int account = 1001;
        int balance = 100;
        int total = account + balance;

        int bonus;
        if (account > 1000) {
            bonus = account / 100 + total;
        } else {  bonus = total;
        }
        System.out.println(bonus);
    }
}