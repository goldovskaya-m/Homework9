import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework9");
        System.out.println("Задача 1");
        double[] monday = {5, 6, 7, 8, 9};
        double SUM = 0;
        for (int i = 0; i < monday.length; i++) {
            SUM += monday[i];
        }
        System.out.printf("Сумма трат за месяц составила %s рублей %n", SUM);
        System.out.println("задача 2");

        //оставила себе, подумать
        //double minMonday = monday[0] / 4;
        //double maxMonday = monday[0] / 4;
        //for (int i = 0; i < monday.length; i++) {
           // if (monday[i] / 4 > minMonday) {
                //maxMonday = monday[i] / 4;
            //}
        //}
        //System.out.println("Максимальные расходы за неделю " + maxMonday);
        //System.out.println("Минимальный расход за неделю " + minMonday);
        //как просил исправить Герман
        double minMonday2 = monday[0];
        double maxMonday2 = monday[0];
        for (int i = 0; i < monday.length; i++) {
            if (monday[i] > minMonday2) {
                maxMonday2 = monday[i];
            }
        }
        System.out.println("Максимальные расходы за месяц " + maxMonday2);
        System.out.println("Минимальный расход за месяц " + minMonday2);

        System.out.println("Задача 3");
        double SUM2 = 0;
        for (int i = 0; i < monday.length; i++) {
            SUM2 += monday[i];
        }
        double averageWeek = ((double) SUM2 / monday.length) ;
        System.out.printf("Средняя сумма трат за месяц  35/5 = " +
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
        // Исправлено, как просил Герман

        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
            if (i != reverseFullName.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();


    }
    }


