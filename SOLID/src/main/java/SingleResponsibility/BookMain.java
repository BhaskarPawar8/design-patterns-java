package SingleResponsibility;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Alchemis","Paulo coehello", "Sometextaboubtbook");

        book.replaceWordsInText("text","words");

        System.out.println("Does text contain words " + book.isWordinText("words"));

        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printBookToConsole(book);

        bookPrinter.printBookToEmail(book);
    }
}
