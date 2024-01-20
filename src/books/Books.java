package books;

public class Books {
    private int year;
    public Books(String author, int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}