public class VideosInformativos {
    private int duracion; // en segundos
    private String url;
    private String formato;
    private String descripcionBreve;

    // Constructor
    public VideosInformativos(String url, String formato, int duracion) {
        this.url = url;
        this.formato = formato;
        this.duracion = duracion;
    }

    // Métodos
    public boolean reproducir() {
        System.out.println("Reproduciendo video desde: " + url);
        return true;
    }

    public boolean pausar() {
        System.out.println("Video pausado.");
        return true;
    }

    // Getters y Setters
    // ...
}
