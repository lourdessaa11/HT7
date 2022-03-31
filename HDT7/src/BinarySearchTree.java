/**
 * @author Manuel Martinez
 * @author Lourdes Saavedra
 * 
 * BinarySearchTree.
 * Estructura de árbol binario
 * Los elementos del árbol son comparables
 * Adaptado de https://www.softwaretestinghelp.com/binary-search-tree-in-java/ 
 */

public class BinarySearchTree<E extends Comparable<E>> {
    
    Node<E> root;

    /**
     * Constructor
     */
    BinarySearchTree(){
        root = null;
    }

    /**
     * Inserta valor al árbol
     * @param data
     */
    public void insert(E data){
        root = insert(root, data);
    }

    /**
     * Métoto recursivo para insertar
     * @param node Nodo
     * @param data
     * @return
     */
    public Node<E> insert(Node<E> node, E data){
        if (node == null){
            node = new Node<E>(data);
            return node;
        }
        if (data.compareTo(node.key) < 0){
            node.left = insert(node.left, data);
        } else if (data.compareTo(node.key) > 0){
            node.right = insert(node.right, data);
        }
        return node;
    }

    /**
     * Busca un valor en el árbol
     * @param data
     * @return el valor si se encuentra, si no null
     */
    public E search(E data){
        Node<E> node =  search(root, data);
        if (node == null){
            return null;
        } else {
            return node.key;
        }
    }

    /**
     * Método recursivo para búsqueda
     * @param node Nodo
     * @param data
     * @return Nodo a buscar
     */
    public Node<E> search(Node<E> node, E data){
        if (node == null || node.key.compareTo(data) == 0){
            return node;
        }
        if (data.compareTo(node.key) < 0){
            return search(node.left, data);
        }
        return search(node.right, data);
    }

    /**
     * Genera texto con los elementos inorder
     * @return texto inorder
     */
    public String inorder(){
        return inorder(root, "");
    }

    /**
     * Método recursivo para generar texto inorder
     * @param root Nodo
     * @param txt texto
     * @return texto inorder
     */
    public String inorder(Node<E> node, String txt){
        if (node != null){
            txt = inorder(node.left, txt);
            txt += node.key.toString() + " ";
            txt = inorder(node.right, txt);
        }
        return txt;
    }
}

/**
 * Nodo.
 * Contiene un valor que es Comparable.
 */
class Node<E extends Comparable<E>> {
    E key;
    Node<E> left, right;

    /**
     * Constructor
     * @param data
     */
    public Node(E data){
        key = data;
        left = null;
        right = null;
    }
}
