import java.util.Scanner;
import java.util.Scanner;

/**
 * Ваш робот уже умеет знакомиться, здороваться в зависимости от времени суток и хвалить за успехи в программировании.
 * Научите его ещё начинать общение с короткого приветствия и спрашивать у пользователя, из какого он города.
 * Сделайте это с помощью методов sayHello() и printCity(). Результат должен получиться таким:
 * <p>
 * Привет!
 * Который час?
 * > ввод текущего часа
 * Добрый день! (один из вариантов)
 * Как вас зовут?
 * > ввод имени
 * Из какого вы города?
 * > ввод города
 * Рад познакомиться, <ваше имя> из <вашего города>!
 * У вас уже неплохо получается программировать!
 */


class Praktikum13 {


    public static void main(String[] args) {
        System.out.println("Робот-помощник v2.0.");
        sayHello();
        sayHelloByTime();
        welcomeUserByName();
        printCity();
        printSuccess();// Вызовите ниже методы в правильном порядке
    }

    public static void sayHello() {
        System.out.println("Привет!");
    }

    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour > 22) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }


    public static void welcomeUserByName() {

    }

    public static void printCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Из какого вы города?");
        String city = scanner.nextLine();
        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }


    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }


}

