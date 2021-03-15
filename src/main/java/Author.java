import java.util.ArrayList;
import java.util.List;

public class Author {

    private String name;
    private List<Book> books = new ArrayList<>();
    private Address address = new Address();

    Author(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addBook(Book book){
        books.add(book);
    }
}
