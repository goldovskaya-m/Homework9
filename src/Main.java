import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework9");
        System.out.println("Задача 1");
        double[] monday = {5, 6, 7, 8, 9};
        int SUM = 0;
        for (int i = 0; i < monday.length; i++) {
            SUM += monday[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей %n", SUM);
        System.out.println("задача 2");
        double minMonday = monday[0] / 4;
        double maxMonday = monday[0] / 4;
        for (int i = 0; i < monday.length; i++) {
            if (monday[i] / 4 > minMonday) {
                maxMonday = monday[i] / 4;
            }
        }
        System.out.println("Максимальные расходы за месяц " + maxMonday);
        System.out.println("Минимальный расход за месяц " + minMonday);
        System.out.println("Задача 3");
        int SUM2 = 0;
        for (int i = 0; i < monday.length; i++) {
            SUM2 += monday[i];
        }
        double averageWeek = ((double) SUM2 / monday.length) / 4;
        System.out.printf("Средняя сумма трат за месяц в недели " +
                "составила %s рублей%n ", averageWeek);
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length && i < 5; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));
        // 2 вариант Задача 4
        char[] reverseFullName2 = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp2;
        for (int i = 0; i < reverseFullName2.length /2 ; i++) {
            temp = reverseFullName2[i];
            reverseFullName2[i] = reverseFullName2[reverseFullName2.length - 1 - i];
            reverseFullName2[reverseFullName2.length -1 -i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName2));

        }
    }


