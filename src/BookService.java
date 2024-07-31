import java.util.ArrayList;

public class BookService {
    private Searcher searcher = new Searcher();

    private ArrayList<Book> books= new ArrayList<>();

    public void add(Book book){
        books.add(book);
    }

    public void edit(int id,Book book){
        int code = searcher.searchBook(id,books);

        books.set(code,book);
    }

    public void delete(int id) {
        int code = searcher.searchBook(id,books);

        books.remove(code);
    }

    public void show(int id) {
        int code = searcher.searchBook(id,books);

        System.out.println(books.get(code).toString());
    }

    public void list() {
        System.out.println(books);
    }
}
