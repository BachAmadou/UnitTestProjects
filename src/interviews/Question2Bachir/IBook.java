package interviews.Question2Bachir;

public interface IBook {
    int getId();
    String getTitle();
    int getTotalNumberOfCopies();
    int getAvailableCopies();
    void setAvailableCopies(int availableCopies);
}
