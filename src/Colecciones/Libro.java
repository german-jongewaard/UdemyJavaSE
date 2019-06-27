package Colecciones;

/**
 *
 * @author german
 */
public class Libro {
    
    private String autor;
    private String titulo;
    private int isbn;

    public Libro(String autor, String titulo, int isbn) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    //Método creado para ver la info del libro
    public String getDatos(){
        return "El título es: " + titulo + ". El autor es: " + autor 
                + ". Y el ISBN es: " + isbn;
    }

   

     

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.isbn;
        return hash;
    }

    /**
    @Override
    public boolean equals(Object obj){
    //Aqui CASTEO a obj para que se pueda leer el isbn
    Libro otroLibro = (Libro)obj;
    //en el caso de que si sea un instancia del objeto libro...
    //video 171 UDEMY JAVA
    if(obj instanceof Libro){
    if(this.isbn == otroLibro.isbn){
    return true;
    }else{
    return false;
    }
    }else return false;
    }
     * */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (this.isbn != other.isbn) {
            return false;
        }
        return true;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    
}
