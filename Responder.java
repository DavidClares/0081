import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
public class Responder
{
    Random aleatorio;
    ArrayList<String> responses;
    HashMap<String, String> respuestaAdecuada;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        responses = new ArrayList();
        respuestaAdecuada = new HashMap<String, String>();

        responses.add(" 1");
        responses.add(" 2");
        responses.add(" 3");
        responses.add(" 4");
        responses.add(" 5");

        respuestaAdecuada.put("servicio", "Ofrecemos varios servicios.");
        respuestaAdecuada.put("plataformas", "Diseño Multiplataforma.");
        respuestaAdecuada.put("fallos", "Error seran reportados");
        respuestaAdecuada.put("gratuito", " Software de prueba.");

    }

    public String generateResponse(String userInput)
    {
        String response = null;
        response = respuestaAdecuada.get(userInput);

        if (response == null){
            response = responses.get(aleatorio.nextInt(responses.size()));
        }

        return response;
    }
}


