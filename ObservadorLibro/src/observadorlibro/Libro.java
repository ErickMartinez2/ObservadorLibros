package observadorlibro;
import java.util.ArrayList;
import observadorlibro.Usuario;
/**
 *
 * @author Jean Wahlung
 */
public class Libro {
    private String titulo;
    private ArrayList< Usuario> usuariosinteresados ;
    private int numerodisponibles;
    
    public Libro(String titulo){
        this.titulo = titulo;
        this.numerodisponibles = 0;
        usuariosinteresados = new ArrayList();
                
    }
    public Usuario getUsuariosinteresados(int i) {
        return usuariosinteresados.get(i);
    }
    public void SubscribirObservador(Usuario usuario) {
        this.usuariosinteresados.add(usuario);
    }
    public int getNumerodisponibles() {
        return numerodisponibles;
    }
    public void setNumerodisponibles(int numerodisponibles) {
        this.numerodisponibles = numerodisponibles;
        notificarObservadores();
    }
    public void eliminarObservador(Usuario user){
        usuariosinteresados.remove(user);
    }
    public void notificarObservadores(){
        for (Usuario user : usuariosinteresados) {
           user.notificar();
        }
    }
    public String getTitulo() {
        return titulo;
    }        
}
