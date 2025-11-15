import java.util.Map;

public class TipoETS {
    private String nombre;
    private String descripcionBreve;
    private String imagen; // URL o path a la imagen

    // Constructor
    public TipoETS(String nombre, String descripcionBreve, String imagen) {
        this.nombre = nombre;
        this.descripcionBreve = descripcionBreve;
        this.imagen = imagen;
    }

    // Métodos
    public Map<String, String> obtenerInformacionCompleta() {
        // Devuelve un mapa con todos los detalles de la ETS
        return Map.of("nombre", nombre, "descripcion", descripcionBreve);
    }

    public boolean actualizarInformacion(Map<String, String> nuevosDatos) {
        // Actualiza los campos a partir de un mapa
        if (nuevosDatos.containsKey("nombre")) {
            this.nombre = nuevosDatos.get("nombre");
        }
        if (nuevosDatos.containsKey("descripcionBreve")) {
            this.descripcionBreve = nuevosDatos.get("descripcionBreve");
        }
        return true;
    }

    public boolean cambiarEstado(String nuevoEstado) {
        // Lógica para cambiar el estado (ej. 'activo', 'archivado')
        return true;
    }

    // Getters y Setters
    // ...
}
