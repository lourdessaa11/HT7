/**
 * @author Manuel Martinez
 * @author Lourdes Saavedra
 * 
 * Vista.
 * Interactua con el usuario, recibe y muestra mensajes
 */

import java.util.Scanner;

public class Vista {
    
    Scanner scn;

    /**
     * Constructor
     */
    Vista(){
        scn = new Scanner(System.in);
    }

    /**
     * Obtiene el path de archivo
     * @return path
     */
    public String getPath(){
        mostrarMsg("\nIngrese path del archivo diccionario\n");
        return scn.nextLine();
    }

    /**
     * Obtiene texto a traducir
     * @return texto
     */
    public String getTexto(){
        mostrarMsg("\nIngrese texto a traducir\n(Ingrese 'INORDER' para recorrer un diccionario inorder y Q para salir)\n");
        return scn.nextLine();
    }

    /**
     * Obtiene idioma de origen
     * @return número del idioma
     */
    public int getOrigen(){
        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            try {
                mostrarMsg("\nIngrese idioma de origen\n1 - Espanol\n2 - Ingles\n3 - Frances\n");
                opcion = scn.nextInt();
                scn.nextLine();
            } catch (Exception e){
                mostrarMsg("Ingrese un dato valido");
            }
        }
        return opcion;
    }

    /**
     * Obtiene idioma de destino
     * @return número del idioma
     */
    public int getDestino(){
        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            try {
                mostrarMsg("\nIngrese idioma de destino\n1 - Espanol\n2 - Ingles\n3 - Frances\n");
                opcion = scn.nextInt();
                scn.nextLine();
            } catch (Exception e){
                mostrarMsg("Ingrese un dato valido");
            }
        }
        return opcion;
    }

    /**
     * Muestra un mensaje
     * @param msg a mostrar
     */
    public void mostrarMsg(String msg){
        System.out.println(msg);
    }

    /**
     * Obtiene idioma a recorrer
     * @return número del idioma
     */
    public int getIdioma(){
        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            try {
                mostrarMsg("\nIngrese idioma a recorrer\n1 - Espanol\n2 - Ingles\n3 - Frances\n");
                opcion = scn.nextInt();
                scn.nextLine();
            } catch (Exception e){
                mostrarMsg("Ingrese un dato valido");
            }
        }
        return opcion;
    }
}
