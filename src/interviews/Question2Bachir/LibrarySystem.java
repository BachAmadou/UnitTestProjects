package interviews.Question2Bachir;

import java.util.List;

public class LibrarySystem implements ILibrarySystem{

    List<IBook> books;
    private static final int MAX_BORROW = 3;

    public LibrarySystem(List<IBook> books) {
        this.books = books;
    }

    public String borrow(IUser user, IBook book) {
        if(findBookByTitle(book.getTitle()) == null) {
            return book.getTitle() + " does not exist!";
        }

        if (book.getAvailableCopies() < 0) {
            return book.getTitle() + " has no copies available";
        }
        return "";
    }

    // Helper method for IBook
    private IBook findBookByTitle(String title) {
        return books.stream().filter(book -> book.getTitle().equals(title)).findFirst().orElse(null);
    }

    // Helper method for IUser





















}
