/**
 * @author Manuel Martinez
 * @author Lourdes Saavedra
 * 
 * Archivos.
 * Lee el archivo txt y añade los valores a un Map de árboles.
 */

import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Archivos {
    
    /**
     * Lee el archivo y añade los valores a un Map de árboles
     * @param path del archivo
     * @return mapa de árboles
     * @throws IOException si el archivo no existe
     */
    public static HashMap<String, BinarySearchTree<Association<String, HashMap<String, String>>>> leerDiccionario(String path) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(path));
        HashMap<String, BinarySearchTree<Association<String, HashMap<String, String>>>> map = new HashMap<>();
        
        String row;
        String[] arreglo;
        HashMap<String, String> data;
        map.put("spanish", new BinarySearchTree<Association<String, HashMap<String, String>>>());
        map.put("english", new BinarySearchTree<Association<String, HashMap<String, String>>>());
        map.put("french", new BinarySearchTree<Association<String, HashMap<String, String>>>());


        while ((row = reader.readLine()) != null){
        	arreglo = row.toLowerCase().split(",");
            data = new HashMap<String, String>();
            data.put("spanish", arreglo[1]);
            data.put("english", arreglo[0]);
            data.put("french", arreglo[2]);

            map.get("spanish").insert(new Association(arreglo[1], data));
            map.get("english").insert(new Association(arreglo[0], data));
            map.get("french").insert(new Association(arreglo[2], data));
        }
        reader.close();

        return map;
    }

    public static ArrayList<String> leerTexto(String path) throws IOException{
        ArrayList<String> data = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String row;
        while ((row = reader.readLine()) != null){
        	data.add(row);
        }
        reader.close();

        return data;
    }
}

