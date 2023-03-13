class Praktikum6 {
    public static void main(String[] args) {

        int [] expenses = new int[7]; // Объявили массив трат за неделю (7 дней)

        int money = 50; // В первый день потрачено 50 рублей

        // Заполнили массив, используя цикл for
        for (int i = 0; expenses.length > i; i++) {
            expenses[i] = money;
            money = expenses[i] + 100;
        }
        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
    }
}