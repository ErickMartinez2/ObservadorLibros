package observadorlibro;

import observadorlibro.Libro;

/**
 *
 * @author Jean Wahlung
 */
public class Usuario {

    private String nombre;
    private Libro book;

    public Usuario(String nombre, Libro book) {
        this.nombre = nombre;
        this.book = book;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Libro getBook() {
        return book;
    }
    public void setBook(Libro book) {
        this.book = book;
    }
    public void notificar() {
        if (book.getNumerodisponibles() > 0) {
            System.out.println(nombre + "<---- Estan disponibles " + book.getNumerodisponibles() + " unidades del libro " + book.getTitulo() + " ve corriendo a la tienda mas cercana por el!");
        }
    }
}
