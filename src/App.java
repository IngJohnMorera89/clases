
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
       
        Book book1 = new Book();
        Book book2 = new Book("Programaciòn en Java", "John Morera", 900);
        Book book3 = new Book("Learn English", "john morera", 1200, LocalDate.of(2024, 9, 21), "English School", "aprendizaje");
    }
}
