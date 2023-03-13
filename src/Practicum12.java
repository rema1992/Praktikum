import java.util.Scanner;


public class Practicum12 {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
        //sayHelloByTime();
    }


    public static void welcomeUserByName() { // Объявите ниже метод welcomeUserByName
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next(); // Сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }
    // Объявите метод sayHelloByTime
    public static void sayHelloByTime () {


        Scanner scanner = new Scanner(System.in);
        // Спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();


        // В зависимости от времени предусмотрите печать приветствий
        if (currentHour >= 22 || currentHour < 6) {
            System.out.println("Доброй ночи!");


        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");


        } else if (currentHour < 18) {
            System.out.println("Добрый день!");


        } else if (currentHour >= 18 && currentHour < 22) {
            System.out.println("Добрый вечер!");
        }
    }



    public static void printSuccess () { // Объявите метод printSuccess
        System.out.println("У вас уже неплохо получается программировать!");
        // Он должен печатать строку: У вас уже неплохо получается программировать!
    }
}