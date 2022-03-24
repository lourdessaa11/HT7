import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Archivos {
    

    public static HashMap<String, BinarySearchTree<Association<String, Data>>> leer(String path){
        BufferedReader reader = new BufferedReader(new FileReader(data));
        HashMap<String, BinarySearchTree<Association<String, Data>>> map = new HashMap<>();
        
        String row = reader.readLine();
        String[] arreglo = row.split(",");
        Data data = new Data(arreglo[1], arreglo[0], arreglo[2]);
        map.put("spanish", new BinarySearchTree<Association<String, Data>>(new Association(arreglo[1], data)));
        map.put("english", new BinarySearchTree<Association<String, Data>>(new Association(arreglo[0], data)));
        map.put("french", new BinarySearchTree<Association<String, Data>>(new Association(arreglo[2], data)));


        while ((row = reader.readLine()) != null){
        	arreglo = row.split(",");
            data = new Data(arreglo[1], arreglo[0], arreglo[2]);

            map.get("spanish").add(new Association(arreglo[1], data));
            map.get("english").add(new Association(arreglo[0], data));
            map.get("french").add(new Association(arreglo[2], data));
        }
        reader.close();

        return map;
    }
}

