
import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 *
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    /**
     * Construct a Responder - nothing to do
     */
    Random aleatorio;
    ArrayList<String>respuestas;
    HashMap<HashSet, String> respuestaCoherente;

    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestaCoherente = new HashMap<>();
        coincidencias = new HashSet<>();

        coincidencias.add("");

        respuestas.add("Estas seguro?");
        respuestas.add("necesita mas informacion?");
        respuestas.add("cual es tu sistema operativo?");
        respuestas.add("vale , estamos trabajando en el problema");
        respuestas.add("puede facilitarme mas informacion?");
        respuestaCoherente.put("linux" , " que software no funciona?");
        respuestaCoherente.put("si", "que tipo de fallo le esta sucediendo?");
        respuestaCoherente.put("vale" , "le informaremos cuando hayamos acabado");
        respuestaCoherente.put("windows" , " que software no funciona?");
        respuestaCoherente.put("ok", "en algo mas le podemos ayudar?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> userInput)
    {
        Iterator<String>iterator = userInput.iterator();
        boolean buscando = true;
        String respuesta = null;
        while(iterator.hasNext()&& buscando){
            respuesta = respuestaCoherente.get(iterator.next());
            if (respuesta!=null){
                buscando = false;
            }



        }
    }}
