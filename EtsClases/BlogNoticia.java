import java.util.Date;
import java.util.List;

public class BlogNoticia {
    private String titulo;
    private String contenido;
    private String resumen;
    private Date fechaPublicacion;
    private String autor;
    private List<String> etiquetas;
    private String url;
    private String imagenPrincipal;
    private String categoria;

    // Constructor
    public BlogNoticia(String titulo, String contenido, String autor, String categoria) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.categoria = categoria;
        this.fechaPublicacion = new Date();
    }

    // Métodos
    public String obtenerContenidoCompleto() {
        return this.contenido;
    }

    public String obtenerResumen() {
        return this.resumen;
    }

    public boolean estaVigente() {
        // Lógica para determinar si la noticia sigue vigente
        return true;
    }

    public int obtenerTiempoLectura() {
        // Lógica para calcular el tiempo de lectura (ej. palabras/200)
        return contenido.split("\\s+").length / 200;
    }

    // Getters y Setters
    // ...
}
