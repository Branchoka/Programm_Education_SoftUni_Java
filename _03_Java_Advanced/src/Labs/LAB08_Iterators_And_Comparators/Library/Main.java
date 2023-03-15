package LAB08_Iterators_And_Comparators.Library;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        Library library = new Library(bookOne, bookTwo, bookThree);

        for (Book book : library) {
            System.out.println(book.getTitle());
        }

        Iterator<Book> iterator = library.iterator();
        while (iterator.hasNext()){
            Book current = iterator.next();



            System.out.println(current.getTitle());
        }

    }
}
