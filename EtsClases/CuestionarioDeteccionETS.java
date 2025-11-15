import java.util.Date;
import java.util.List;

public class CuestionarioDeteccionETS {
    private List<String> preguntas;
    private List<String> respuestas;
    private String resultado;
    private Date fechaRealizacion;
    private int usuarioId;

    // Constructor
    public CuestionarioDeteccionETS(List<String> preguntas, int usuarioId) {
        this.preguntas = preguntas;
        // Inicializar respuestas para evitar NullPointerException
        this.respuestas = new java.util.ArrayList<>(preguntas.size());
        for (int i = 0; i < preguntas.size(); i++) {
            this.respuestas.add(null); // O un valor por defecto
        }
        this.usuarioId = usuarioId;
    }

    // Métodos
    public boolean responderPregunta(int preguntaId, String respuesta) {
        if (preguntaId >= 0 && preguntaId < respuestas.size()) {
            this.respuestas.set(preguntaId, respuesta);
            return true;
        }
        return false;
    }

    public String generarRecomendaciones() {
        // Lógica para generar recomendaciones basadas en las respuestas
        return "Basado en tus respuestas, te recomendamos consultar a un especialista.";
    }

    public boolean guardarResultado() {
        this.fechaRealizacion = new Date();
        // Lógica para persistir el resultado en la base de datos
        return true;
    }

    // Getters y Setters
    // ...
}
