public class Main {
    public static void main(String[] args) {
        Book book = new Book ("Тихий Дэн", 2020, "OZON61Games", 1000);

        System.out.println(book);

        if (book.isBig()) {
            System.out.println("Книга большая");
        } else {
            System.out.println("Книга маленькая");
        }

        if (book.matches("OZON")) {
            System.out.println("Нужная вам книга");
        } else {
            System.out.println("В описании книги отсутствует заданное значение");
        }

        System.out.println("Стоимость книги равна: " + book.estimatePrice() + (" руб."));

        Book book2 = new Book ("Ночное такси", 2010, "Aguga", 10);

        System.out.println(book2);

        if (book2.isBig()) {
            System.out.println("Книга большая");
        } else {
            System.out.println("Книга маленькая");
        }

        if (book2.matches("OZON")) {
            System.out.println("Нужная вам книга");
        } else {
            System.out.println("В описании книги отсутствует заданное значение");
        }

        System.out.println("Стоимость книги равна: " + book2.estimatePrice() + (" руб."));

    }
}
