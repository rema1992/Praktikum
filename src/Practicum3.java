/**
 * В банке решили разработать приложение, которое поможет менеджерам проводить ипотечные сделки. Сначала банковский работник должен
 * указать участников сделки, потом загрузить их документы, подтверждающие личность. Программа отслеживает, что документы каждого из клиентов сохранены в базе.
 * Сейчас менеджер проводит сделку для семьи из трёх человек: Петра, Надежды и их сына Валентина, они объединены в массиве participants.
 * Пётр планирует предоставить в качестве удостоверения личности паспорт, Надежда — водительское удостоверение, а для оформления Валентина потребуется свидетельство о рождении.
 * Допишите программу таким образом, чтобы в случае, если банковский работник ошибся и загрузил неправильное количество документов,
 * выдавалось предупреждение об ошибке. Для этого вам потребуется создать второй массив для документов documents, получить длины обоих массивов и сопоставить их.
 */


class Praktikum3 {
    public static void main(String[] args) {
        // Создайте и заполните массив именами участников сделки
        String[] participants = {"Петр" , "Надежда" , "Валентин"};
        // Создайте и заполните массив документов участников сделки (с заглавной буквы)
        String[] documents = {"Паспорт" , "Водительское удостоверение" , "Свидетельство о рождении"};

        // Проверьте количество документов, оно должно быть равно числу участников
        if (participants.length == documents.length) {
            System.out.println("Документы загружены верно. Список документов:");
            // Если условие верно, напечатайте список документов в формате: "Пётр: Паспорт"
           for (int i = 0; i < participants.length; i++) {
            System.out.println(participants[i] + ": " +documents[i]);
           }
        } else{
            /* Для ошибки предусмотрите печать такого сообщения:
						 "Количество документов не соответствует количеству участников сделки." */
            System.out.println("Количество документов не соответствует количеству участников сделки.");
        }
    }
}