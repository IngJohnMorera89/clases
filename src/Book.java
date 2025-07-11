
import java.time.LocalDate;

public class Book {
    
    //Atributos

    private String tittle;
    private String author;
    private Integer pages;
    private LocalDate publishDate;
    private String editor;
    private String category;


    //Constructor --> inicializar el objeti

    public Book (){
        tittle = "Las aventuras de John";
        author = "John morera";
        pages =240;
        publishDate = LocalDate.now();
        editor = "McGrawHill";
        category = "Action";
    }

    public Book (String title, String author, Integer pages){
        this.tittle = title;
        this.author =author;
        this.pages =pages;
        publishDate = LocalDate.now();
        editor = "McGrawHill";
        category = "Action";
    }

    public Book (String title, String author, Integer pages, LocalDate publishDate, String editor, String category)  {
        this.tittle = title;
        this.author =author;
        this.pages =pages;
        this.publishDate = publishDate;
        this.editor = editor;
        this.category = category;
    }

    //metodos

    public String dameTuTitulo (){
        return this.tittle;
    }
    // metodos getter --> Obtener los valores de los atributos
    public String  getTittle(){
        return tittle;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPages() {
        return pages;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getEditor() {
        return editor;
    }

    public String getCategory() {
        return category;
    }
    
    //metodos setter --> cambiar el valor de un atributo --> set<Atributo>(TD par)

    public void setCategory(String category) {
        this.category = category;
    }
    
   public String toString() {
        return String.format("Libro: titulo=%s, autor=%s, paginas=%s, publicacion=%s, editorial=%s, categoria=%s",
                getTittle(), getAuthor(),
                getPages().toString(), getPublishDate().toString(),
                getEditor(), getCategory());
        // return "Libro[ titulo: " + title + ", autor: " + author + ", paginas: " +
        // pages + "]";
    }
    }

