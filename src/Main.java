public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int paid = 1100;
        int bonus;
        int vbalance;
        int allbalance = balance + paid;
        if (paid > 1000) {
            bonus = paid / 100;
            vbalance = allbalance + bonus;
            System.out.println("Количество бонусов = " + bonus);
            System.out.println("Итоговый счет = " + vbalance);
        } else {
            System.out.println("Итоговый счет = " + allbalance);
        }
    }
}
