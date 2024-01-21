package authors;

public class Author {
    private String firstName;
    private String lastName;
    private String fullName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public String getName() {
        fullName = firstName + " " + lastName;
        return this.fullName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}