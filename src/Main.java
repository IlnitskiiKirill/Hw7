//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        for (int number = 1; number <= 10; number++) {
            System.out.print(number + " ");
        }
        {
            System.out.println();
        }
        System.out.println("Задача №2");
        for (int numberBack = 10; numberBack >= 1; numberBack--) {
            System.out.print(numberBack + "  ");
        }
        System.out.println();
        System.out.println("Задача №3");
        for (int evenNumbers = 1; evenNumbers <= 17; evenNumbers++) {
            if (evenNumbers % 2 == 0)
                System.out.print(evenNumbers + "  ");
        }
        System.out.println();
        System.out.println("Задача №4");
        for (int a = 10; a >= -10; a--) {
            System.out.print(a + "   ");
        }
        System.out.println();
        System.out.println("Задача №5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println();
        System.out.println("Задача №6");
        for (int v = 7; v <= 98; v = v + 7) {
            System.out.print(v + "  ");
        }
        System.out.println();
        System.out.println("Задача №7");
        for (int q = 1; q <= 512; q = q * 2) {
            System.out.print(q + "  ");
        }
        System.out.println();
        System.out.println("Задача №8");
        int salary = 29000;
        int total = 0;
        for (int mon = 1; mon <= 12; mon++) {
            total = total + salary;
            System.out.println("Месяц " + mon + " сумма накоплений " + total + " рублей");
        }
        System.out.println();
        System.out.println("Задача №9");
        total = 0;
        double pers = 1D / 100;
        for (int mon = 1; mon <= 12; mon++) {
            total = total + salary;
            total = (int) (total * (1 + pers));
            System.out.println("Месяц " + mon + " сумма накоплений " + total + " рублей");
        }
        System.out.println();
        System.out.println("Задача №10");
        for (int vrr = 1; vrr <= 10; vrr++) {
            System.out.printf("%d x %d = %d%n", 2, vrr, 2 * vrr);
        }
    }
}



