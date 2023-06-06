package modulo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class ControladoraJson
{

    /**
     * Crea un archivo json
     * @param personas = arrayList de personas
     */
    public static void grabarArchivoEnJson (ArrayList<Persona> personas) //un jsonArray de jsonObject
    {
        JSONArray miPrimerJsonArray = new JSONArray();

        try {
            for(Persona p : personas) //por cada persona del array personas
            {
                JSONObject jsonObj = new JSONObject(); //hago un jsonObject e ingreso sus datos
                jsonObj.put("nombre",p.getNombre());
                jsonObj.put("edad",p.getEdad());
                jsonObj.put("nacionalidad",p.getNacionalidad());

                miPrimerJsonArray.put(jsonObj); //lo inserto en el jsonArray
            }

            System.out.println(miPrimerJsonArray.toString()); //string del json
            JsonUtiles.grabar(miPrimerJsonArray, "archivoJsonArray"); //archivo json

        }catch (JSONException e)
        {
            System.out.println("[!] clave null");;
        }
    }
}
