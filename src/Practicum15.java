public class Practicum15 {

    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел = " + findMax());


    }

    public static int findMax() {
        int a = 10;
        int b = 15;
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}