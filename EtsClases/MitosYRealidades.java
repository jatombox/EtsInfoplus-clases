import java.util.Date;

public class MitosYRealidades {
    private int id;
    private String mito;
    private String realidad;
    private String fuente;
    private boolean esVerificado;
    private Date fechaActualizacion;

    // Constructor
    public MitosYRealidades(int id, String mito, String realidad, String fuente, boolean esVerificado, Date fechaActualizacion) {
        this.id = id;
        this.mito = mito;
        this.realidad = realidad;
        this.fuente = fuente;
        this.esVerificado = esVerificado;
        this.fechaActualizacion = fechaActualizacion;
    }

    // Métodos
    public boolean marcarComoVerificado() {
        this.esVerificado = true;
        this.fechaActualizacion = new Date();
        // Lógica adicional
        return true;
    }

    public boolean actualizarMito(String nuevoMito) {
        this.mito = nuevoMito;
        // Lógica adicional
        return true;
    }

    public boolean actualizarRealidad(String nuevaRealidad) {
        this.realidad = nuevaRealidad;
        // Lógica adicional
        return true;
    }

    public boolean validarInformacion() {
        // Lógica para validar la fuente o la información
        return !this.fuente.isEmpty();
    }

    public String obtenerResumen() {
        return "Mito: " + this.mito + "\nRealidad: " + this.realidad;
    }

    // Getters y Setters
    // ...
}
