import java.util.Scanner;

public class Vista {
    
    Scanner scn;

    Vista(){
        scn = new Scanner(System.in);
    }

    public String getPath(){
        mostrarMsg("\nIngrese path del archivo diccionario\n");
        return scn.nextLine();
    }

    public String getTexto(){
        mostrarMsg("\nIngrese texto a traducir (Ingrese Q para salir)\n");
        return scn.nextLine();
    }

    public int getOrigen(){
        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            try {
                mostrarMsg("\nIngrese idioma de origen\n1 - Español\n2 - Inglés\n3 - Francés\n");
                opcion = scn.nextInt();
                scn.nextLine();
            } catch (Exception e){
                mostrarMsg("Ingrese un dato válido");
            }
        }
        return opcion;
    }

    public int getDestino(){
        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            try {
                mostrarMsg("\nIngrese idioma de destino\n1 - Español\n2 - Inglés\n3 - Francés\n");
                opcion = scn.nextInt();
                scn.nextLine();
            } catch (Exception e){
                mostrarMsg("Ingrese un dato válido");
            }
        }
        return opcion;
    }

    public void mostrarMsg(String msg){
        System.out.println(msg);
    }
}
