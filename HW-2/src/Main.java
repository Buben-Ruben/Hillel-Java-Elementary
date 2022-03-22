import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in); //Объявление переменной сканера
        String name;                    //Инициализация переменных
        String surname;
        int initialDeposit;
        float percent;
        int percentSum;
        int num1 = 2;
        int num2 = 2;
        System.out.print("Введите имя: ");
        name = sc.nextLine();           //Присвоение переменной данных с клавиатуры
        System.out.print("Введите фамилию: ");
        surname = sc.nextLine();
        System.out.print("Введите сумму взноса $: ");
        initialDeposit = sc.nextInt();
        System.out.print("Введите процентную ставку %год: ");
        percent = sc.nextFloat();
        System.out.println("\nВычисление\n===================\nЗдраствуйте, "+name+" "+surname);
        System.out.println("При сумме взноса "+initialDeposit+" $ и процентной ставке "+(int) percent+"%/год\nГрафик начислений будет таким:");
        percentSum = (int) (initialDeposit * (percent / 100));              // Формула подсчёта суммы депозита за 1 год
        System.out.println("Сумма процентов за 1 год:\t"+percentSum+" $\t\tСумма к выплате:  "+(initialDeposit + percentSum)+" $");
        percentSum = (int) (initialDeposit * (percent / 100) * 5);          // Формула подсчёта суммы депозита за 5 лет
        System.out.println("Сумма процентов за 5 лет:\t"+percentSum+" $\t\tСумма к выплате:  "+(initialDeposit + percentSum)+" $");
        percentSum = (int) (initialDeposit * (percent / 100) * 10);         // Формула подсчёта суммы депозита за 10 лет
        System.out.println("Сумма процентов за 10 лет:\t"+percentSum+" $\t\tСумма к выплате:  "+(initialDeposit + percentSum)+" $");
        System.out.println("\nС уважением Monobank 2.0\nP.S: "+num1+"+"+num2+" = "+(num1+num2));    //Сумирувание двух чисел
    }
}
