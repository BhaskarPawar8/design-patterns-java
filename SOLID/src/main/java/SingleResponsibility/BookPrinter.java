package SingleResponsibility;

import SingleResponsibility.Book;
class BookPrinter {

    public void printBookToConsole(Book book){
        System.out.println("Printing book to consolde");
        System.out.println(book);

    }

    public void printBookToEmail(Book book){
        System.out.println("Printing book to Email");
        System.out.println(book);

    }

}