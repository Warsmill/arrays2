import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] costsPerMonth = new int[]{20_004, 25_000, 19_000, 17_000, 23_000};
        int amountCosts = 0;
        for (int i = 0; i < costsPerMonth.length; i++){
            amountCosts = amountCosts + costsPerMonth[i];
        }
        System.out.println("Сумма трат за месяц составила " + amountCosts + " рублей");

        int[] expensesPerWeek = new int[]{3000, 5500, 2500, 4000, 5000};
        int maxCost = -1;
        int minCost = 0;
        for(int i = 0; i < expensesPerWeek.length; i++){
            int current = expensesPerWeek[i];
            if (current > maxCost){
                maxCost = current;
                minCost = maxCost;
            }

            current = expensesPerWeek[i];
            if (current < minCost){
                minCost = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCost +
                " рублей. Максимальная сумма трат за неделю составила " + maxCost + " рублей.");

        double averageCostsPerMonth = (double)amountCosts / costsPerMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageCostsPerMonth + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0, number = reverseFullName.length - 1;i < number; number--, i++) {
            char x = reverseFullName[i];
            reverseFullName[i] = reverseFullName[number];
            reverseFullName[number] = x;
        }
        System.out.print(reverseFullName);
    }
}