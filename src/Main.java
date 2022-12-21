public class Main {
    public static void main(String[] args) {

        System.out.println("Итоговый счет:");

        int amount = 700; //сумма на счету
        int replenishment = 1200; //начисленная сумма
        int bonus = 1; //количество бонусов

        int addBonus;
        if (replenishment > 1000) {
            addBonus = replenishment / 100 * bonus;
        } else {
            addBonus = 0;
        }
        System.out.println(amount + replenishment + addBonus);


    }
}