import modulo.ControladoraJson;
import modulo.JsonUtiles;
import modulo.Persona;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/***
 * CODIFICACION DE TEXTO Y ARCHIVOS JSON (java to json)
 */
public class Main {
    public static void main(String[] args)
    {

        System.out.println("\nJSON OBJECT");
        JSONObject miPrimerJsonObject = new JSONObject();
        JSONObject persona  = new JSONObject();

        try
        {
            miPrimerJsonObject.put("nombre","vicky");
            miPrimerJsonObject.put("edad",19);
            miPrimerJsonObject.put("nacionalidad","argentina");

            persona.put("nombre","sara");
            persona.put("edad","9");
            persona.put("nacionalidad","argentina");

            System.out.println(miPrimerJsonObject.toString());
            JsonUtiles.grabar(miPrimerJsonObject,"archivoJsonObject"); //creo archivos

        }catch (JSONException e)
        {
            System.out.println(e.getMessage());
        }




        System.out.println("\nJSON ARRAY");
        ArrayList<Persona> personas = new ArrayList<>(); //intente hacer un clase array de personas pero no podia manejar los indices despues
        Persona vicky = new Persona("victoria",19,"argentina");
        Persona sofi = new Persona("sofia",22,"peru");
        Persona ramiro = new Persona("ramiro",17,"brasil");
        Persona sara = new Persona("sara",9,"cuba");

        personas.add(vicky);
        personas.add(sofi);
        personas.add(ramiro);
        personas.add(sara);

        ControladoraJson.grabarArchivoEnJson(personas); //hice una controlodora para manejar el arreglo, que ingresen los datos


    }
}