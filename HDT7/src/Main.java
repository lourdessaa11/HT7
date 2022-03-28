import java.util.HashMap;

public class Main {
    
    public static void main(String[] args){
        Traductor trad = null;
        Vista vista = new Vista();
        while (true){
            try {
                trad = new Traductor(Archivos.leer(vista.getPath()));
                break;
            } catch (Exception e){
                vista.mostrarMsg("\nError al leer el archivo");
            }
        }   


        String texto = "";
        String origen = "";
        String destino = "";
        while (true){
            texto = vista.getTexto();
            if (texto.equals("Q")){
                break;
            }
            switch (vista.getOrigen()){
                case 1:
                    origen = "spanish";
                    break;
                case 2:
                    origen = "english";
                    break;
                case 3:
                    origen = "french";
                    break;
            }
            switch (vista.getDestino()){
                case 1:
                    destino = "spanish";
                    break;
                case 2:
                    destino = "english";
                    break;
                case 3:
                    destino = "french";
                    break;
            }
            vista.mostrarMsg(trad.traducir(origen, destino, texto));
        }

    }
}
