package interviews.Question2Bachir;

import java.util.List;

public interface IUser{
    int getId();
    String getEmail();
    List<IBook> getBorrowedBooks();
    List<IBook> getReservedBooks();
}
