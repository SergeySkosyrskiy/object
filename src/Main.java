
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]  args) {

        main();
    }

    private static void main() {


        Author authorOne = new Author("Иван", "Гумманитариев");
        Book bookOne = new Book("Я программист", 2024, authorOne);
        System.out.println("Название книги - " + bookOne.getNameBook());
        //System.out.println("Автор книги = " + authorOne);
        System.out.println("Автор книги - " + authorOne.getName() + " " + authorOne.getLastName());
        System.out.println("Год публикации - " + bookOne.getYearPublicationBook());
        bookOne.setYearPublicationBook(2023);
        System.out.println("Изменённая дата - " + bookOne.getYearPublicationBook());

        System.out.println();

        Author authorTwo = new Author("Алексей", "Шаурминов");
        Book bookTwo = new Book("Велосипед", 2022, authorTwo);
        System.out.println("Название книги - " + bookTwo.getNameBook());
        //System.out.println("Автор книги = " +bookTwo);
        System.out.println("Автор книги - " + authorTwo.getName() + " " + authorTwo.getLastName());
        System.out.println("Год публикации - " + bookTwo.getYearPublicationBook());
    }
}
