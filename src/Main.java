public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println("Интерация цикла " + i);
        }
        //task2
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println("Интерация цикла " + i);
        }
        //task3
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println("Интерация цикла " + i);
        }
        //task4
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println("Интерация цикла " + i);
        }
        //task5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        //task6
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        //task7
        for (int i = 2; i < 513; i = i * 2) {
            System.out.println(i);
        }
        //task8
        int investment = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + investment;
        }
        System.out.println(total);

        //task9
        int depositAmount = 29000;
        int totalAmount = 0;
        for (int i = 0; i < 12; i++) {
            totalAmount = totalAmount + totalAmount / 100;
            totalAmount = totalAmount + depositAmount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalAmount + " рублей");
        }

        //task10
        int j = 0;
        for (int i = 1; i < 11; i = i + 1) {
            j = i * 2;
            System.out.println("2 * " + i + " = " + j);
        }

    }
}
