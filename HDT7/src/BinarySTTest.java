/**
 * @author Manuel Martinez
 * @author Lourdes Saavedra
 * 
 * BinarySTTest.
 * Evalua operaciones del árbol binario
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySTTest {
    
    /**
     * Evalua Insert e Inorder
     */
    @Test
    public void testInsertInorder(){
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(3);
        assertEquals("3 ", bst.inorder());
        bst.insert(5);
        assertEquals("3 5 ", bst.inorder());
        bst.insert(4);
        assertEquals("3 4 5 ", bst.inorder());
        bst.insert(6);
        assertEquals("3 4 5 6 ", bst.inorder());
        bst.insert(1);
        assertEquals("1 3 4 5 6 ", bst.inorder());
    }

    /**
     * Evalua Search.
     */
    @Test
    public void testSearch(){
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(3);
        bst.insert(5);
        bst.insert(4);
        bst.insert(6);
        bst.insert(1);
        assertEquals(4, bst.search(4));
        assertEquals(null, bst.search(2));
        assertEquals(6, bst.search(6));
    }

    /**
     * Evalua los métodos cuando una Association es el elemento.
     */
    @Test
    public void testAssociation(){
        BinarySearchTree<Association<String, Integer>> bst = new BinarySearchTree<>();
        bst.insert(new Association<String, Integer>("a", 1));
        bst.insert(new Association<String, Integer>("d", 2));
        bst.insert(new Association<String, Integer>("c", 3));
        bst.insert(new Association<String, Integer>("b", 4));
        assertEquals("a b c d ", bst.inorder());
        assertEquals(2, bst.search(new Association<String, Integer>("d", null)).getValue());
        assertEquals(null, bst.search(new Association<String, Integer>("x", null)));
        assertEquals(4, bst.search(new Association<String, Integer>("b", null)).getValue());
    }
}
