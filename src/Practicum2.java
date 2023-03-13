class Praktikum {
    public static void main(String[] args) {
        double[] expenses = {100.50, 500.00, 10.00, 0.0, 40.60, 500.10, 200.00, 0.0, 50.10, 14.65, 5.10, 11.0};

        System.out.println("Сколько всего записей о расходах?");
        // Посчитайте размер массива
        int recordsCount = expenses.length;

        // Напечатайте полученный результат
        System.out.println(recordsCount);
    }
}