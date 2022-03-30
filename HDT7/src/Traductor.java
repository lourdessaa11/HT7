/**
 * @author Manuel Martinez
 * @author Lourdes Saavedra
 * 
 * Traductor.
 * Traduce un texto utilizando los árboles y maps.
 * Funciona con inglés, español y francés
 */

import java.util.HashMap;

public class Traductor {
	
	HashMap<String, BinarySearchTree<Association<String, HashMap<String, String>>>> data;

	/**
	 * Constructor
	 * @param data_ map de árboles
	 */
	Traductor(HashMap<String, BinarySearchTree<Association<String, HashMap<String, String>>>> data_){
		data = data_;
	}

	/**
	 * Traduce un texto. Si no encuentra la palabra, la encierra entre asteriscos
	 * @param origen idioma de origen
	 * @param destino idioma de destino
	 * @param texto texto a traducir
	 * @return texto traducido
	 */
	public String traducir(String origen, String destino, String texto){
		texto = texto.toLowerCase();
		HashMap<String, String> map = null;
		Association<String, HashMap<String, String>> ass;
		String resultado = "";
		for (String s : texto.split(" ")){
			ass = data.get(origen).search(new Association(s, map));
			if (ass == null){
				resultado += "*" + s + "*" + " ";
			}
			else {
				String trad = ass.getValue().get(destino);
				resultado += trad + " ";
			}
		}
		return resultado;
	}

	/**
	 * Recorre un árbol inorder
	 * @param idioma idioma del árbol a recorrer
	 * @return Texto del árbol inorder
	 */
	public String inorder(String idioma){
		return data.get(idioma).inorder();
	}
}