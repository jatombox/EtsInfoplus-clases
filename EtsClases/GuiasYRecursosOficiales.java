import java.io.File;
import java.util.List;

public class GuiasYRecursosOficiales {
    private String titulo;
    private String descripcion;
    private String tipo;
    private String entidadEmisora;
    private int anioPublicacion;
    private boolean versionProfesionales;
    private String urlDescarga;
    private String formato;
    private List<String> categorias;

    // Constructor
    public GuiasYRecursosOficiales(String titulo, String urlDescarga, String formato) {
        this.titulo = titulo;
        this.urlDescarga = urlDescarga;
        this.formato = formato;
    }

    // Métodos
    public File descargarGuia() {
        // Lógica para descargar el archivo desde la URL
        return new File(urlDescarga);
    }

    public boolean verEnLinea() {
        // Lógica para abrir la guía en un visor online
        return true;
    }

    public boolean esVersionPacientes() {
        return !this.versionProfesionales;
    }

    public boolean esVersionProfesionales() {
        return this.versionProfesionales;
    }

    public String obtenerInformacionCompleta() {
        return titulo + " - " + entidadEmisora + " (" + anioPublicacion + ")";
    }

    public boolean estaVigente() {
        // Lógica para comprobar la vigencia del recurso
        return true;
    }

    // Getters y Setters
    // ...
}
