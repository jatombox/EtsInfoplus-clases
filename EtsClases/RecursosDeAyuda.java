import java.util.List;
import java.util.Map;

public class RecursosDeAyuda {
    private int id;
    private String organizacion;
    private List<String> telefonos;
    private String email;
    private String whatsapp;
    private String cobertura;
    private String tipoServicio;
    private boolean esEmergencia;

    // Constructor
    public RecursosDeAyuda(int id, String organizacion, List<String> telefonos) {
        this.id = id;
        this.organizacion = organizacion;
        this.telefonos = telefonos;
    }

    // Métodos
    public Map<String, Object> obtenerInformacionCompleta() {
        return Map.of(
            "organizacion", organizacion,
            "telefonos", telefonos,
            "email", email
        );
    }

    public boolean contactarPorTelefono() {
        System.out.println("Llamando a: " + telefonos.get(0));
        return true;
    }

    public boolean contactarPorEmail() {
        System.out.println("Enviando email a: " + email);
        return true;
    }

    public String obtenerEnlaceWhatsapp() {
        return "https://wa.me/" + whatsapp;
    }

    public boolean esServicioNacional() {
        return "Nacional".equalsIgnoreCase(cobertura);
    }

    public String obtenerTelefonosFormateados() {
        return String.join(", ", telefonos);
    }

    // Getters y Setters
    // ...
}
