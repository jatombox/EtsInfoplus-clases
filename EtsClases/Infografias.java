public class Infografias {
    private String imagen; // URL o path
    private String tamano; // Ej: "1080x1920"

    // Constructor
    public Infografias(String imagen, String tamano) {
        this.imagen = imagen;
        this.tamano = tamano;
    }

    // Métodos
    public boolean ampliar() {
        System.out.println("Ampliando imagen: " + imagen);
        return true;
    }

    public boolean descargar() {
        System.out.println("Descargando imagen: " + imagen);
        return true;
    }

    // Getters y Setters
    // ...
}
