/**
 * @author Manuel Martinez
 * @author Lourdes Saavedra
 * 
 * Main.
 * Contiene el método main
 */


public class Main {
    
    public static void main(String[] args){
        Traductor trad = null;
        Vista vista = new Vista();
        while (true){
            try {
                trad = new Traductor(Archivos.leerDiccionario(vista.getPath()));
                break;
            } catch (Exception e){
                vista.mostrarMsg("\nError al leer el archivo");
            }
        }   


        String texto = "";
        String origen = "";
        String destino = "";
        String idioma = "";

        while (true){
            texto = vista.getTexto();
            if (texto.equals("Q")){
                break;
            }
            else if (texto.equals("INORDER")){
                switch (vista.getIdioma()){
                    case 1:
                        idioma = "spanish";
                        break;
                    case 2:
                        idioma = "english";
                        break;
                    case 3:
                        idioma = "french";
                        break;
                }
                vista.mostrarMsg(trad.inorder(idioma));
            } else {
                try {
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
                    for (String txt : Archivos.leerTexto(texto)){
                        vista.mostrarMsg(trad.traducir(origen, destino, txt));
                    }
                } catch (Exception e){
                    vista.mostrarMsg("Error al leer el archivo");
                }
            }
        }

    }
}
