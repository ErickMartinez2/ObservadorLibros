/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observadorlibro;
import observadorlibro.Usuario;
import observadorlibro.Libro;
/**
 *
 * @author Jean Wahlung
 */
public class BookDemoObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro("Lo que el viento se llevó");
        Libro libro2 = new Libro ("El Alquimista");
        Usuario jean = new Usuario("Jean Wahlung",libro2);
        Usuario sara = new Usuario("Sara Suazo",libro2);
        Usuario erick = new Usuario("Erick Martinez", libro);
        Usuario christian = new Usuario("Christian Najera",libro);
        libro2.SubscribirObservador(sara);
        libro2.SubscribirObservador(jean);
        libro.SubscribirObservador(erick);
        libro.SubscribirObservador(christian);
        libro.setNumerodisponibles(7);
        libro2.setNumerodisponibles(10);
        libro2.eliminarObservador(sara);
        libro2.setNumerodisponibles(2);
        
        
    }
    
}
