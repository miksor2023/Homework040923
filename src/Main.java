import java.util.Locale;

public class Main {
    public static void main(String[] args){
        //
        //задача 1
        System.out.println("\nЗадача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        //
        //задача 2
        System.out.println("\nЗадача 2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        //
        //задача 3
        System.out.println("\nЗадача 3");
        for (int i = 0; i < 17; i = i + 2){
            System.out.println(i);
        }
        //
        //задача 4
        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        //задача 5
        System.out.println("\nЗадача 5");
        for (int year = 1904; year <= 2096; year = year + 4){
            System.out.println(year + "-й год является високосным");
        }
        //
        //задача 6
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.print(i + " ");
        }
        //
        //задача 7
        System.out.println("\n\nЗадача 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.print(i + " ");
        }
        //
        //задача 8
        System.out.println("\n\nЗадача 8");
        int deposit = 29000;
        int sum1 = 0;
        for (int month = 1; month <= 12; month++){
            sum1 = sum1 + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum1 + " рублей");
        }
        //
        //задача 9
        System.out.println("\nЗадача 9");
        //переменная для вклада deposite была инициализирована в прошлой задаче
        double sum2 = 0;//новая переменная дробного типа sum2
        double increaseOnePercent = 1.01; //коэффициент для увеличения числа на 1 процент
        for (int month = 1; month <= 12; month++){
            sum2 = (sum2 + deposit) * increaseOnePercent;
            System.out.printf(Locale.US, "Месяц " + month + ", сумма накоплений равна %.2f рублей\n", sum2);
        }
        //
        //задача 10
        System.out.println("\nЗадача 10");
        int j;
        for (int i = 1; i <= 10; i++) {
            j = i * 2;
            System.out.println("2 * " + i + " = " + j);
        }

    }
}