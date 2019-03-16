/*
(15%) Use the Java programming language to implement a class that implements all the methods of the sorted map ADT using an AVL tree.
 */

//public class TMA_3_2 {
//}

import java.util.*; //For Utility package
class AVLNode
{
    //Data for left part and right part with data value and height
    AVLNode left, right;
    int data;
    int height;
    //AvlNode initialization
    public AVLNode()
    {
        left = null;
        right = null;
        data = 0;
        height = 0;
    }
    //Node data value with object initilization
    public AVLNode(int n)
    {
        left = null;
        right = null;
        data = n;
        height = 0;
    }
}
// Avl class Which use the above class , AVLNode
class AVLTree
{
    //Instance of AVLNOde which will handle all operations
    private AVLNode root;
    public AVLTree()
    {
        root = null; // Initialization of the main class object
    }
    //Method to check tree is empty or not
    public boolean isEmpty()
    {
        return root == null;
    }
    // If need, to make tree empty, method directly
    public void makeEmpty()
    {
        root = null;
    }
    //Method Definition for inserting data to appropriate root value
    public void insert(int data)
    {
        root = insert(data, root);
    }
    //Method to get avl Height
    private int height(AVLNode t )
    {
        return t == null ? -1 : t.height;
    }
    //Method to get max of left/right node
    private int max(int lhs, int rhs)
    {
        return lhs > rhs ? lhs : rhs;
    }
    //Method to insert data recursively
    private AVLNode insert(int x, AVLNode t)
    {
        if (t == null)
            t = new AVLNode(x);
        else if (x < t.data)
        {
            t.left = insert( x, t.left );
            if( height( t.left ) - height( t.right ) == 2 )
                if( x < t.left.data )
                    t = rotateWithLeftChild( t );
                else
                    t = doubleWithLeftChild( t );
        }
        else if( x > t.data )
        {
            t.right = insert( x, t.right );
            if( height( t.right ) - height( t.left ) == 2 )
                if( x > t.right.data)
                    t = rotateWithRightChild( t );
                else
                    t = doubleWithRightChild( t );
        }
        else ; // Duplicate; do nothing
        t.height = max( height( t.left ), height( t.right ) ) + 1;
        return t;
    }
    // Rotate binary tree node with left child
    private AVLNode rotateWithLeftChild(AVLNode k2)
    {
        AVLNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = max( height( k2.left ), height( k2.right ) ) + 1;
        k1.height = max( height( k1.left ), k2.height ) + 1;
        return k1;
    }
    // Rotate binary tree node with right child */
    private AVLNode rotateWithRightChild(AVLNode k1)
    {
        AVLNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = max( height( k1.left ), height( k1.right ) ) + 1;
        k2.height = max( height( k2.right ), k1.height ) + 1;
        return k2;
    }
    //Double rotate binary tree node: first left child, with its right child
    private AVLNode doubleWithLeftChild(AVLNode k3)
    {
        k3.left = rotateWithRightChild( k3.left );
        return rotateWithLeftChild( k3 );
    }
    //Double rotate binary tree node: first right child with its left child
    private AVLNode doubleWithRightChild(AVLNode k1)
    {
        k1.right = rotateWithLeftChild( k1.right );
        return rotateWithRightChild( k1 );
    }
    //Method to Count Nodes in tree
    public int countNodes()
    {
        return countNodes(root);
    }
    private int countNodes(AVLNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }
    //Method to search a value in tree
    public boolean search(int val)
    {
        return search(root, val);
    }
    private boolean search(AVLNode r, int val)
    {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.data;
            if (val < rval)
                r = r.left;
            else if (val > rval)
                r = r.right;
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    //Inorder order traversal
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(AVLNode r)
    {
        if (r != null)
        {
            inorder(r.left);
            System.out.print(r.data +" ");
            inorder(r.right);
        }
    }
    //Preorder Traversal
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(AVLNode r)
    {
        if (r != null)
        {
            System.out.print(r.data +" ");
            preorder(r.left);
            preorder(r.right);
        }
    }
    //Postorder traversal
    public void postorder()
    {
        postorder(root);
    }
    private void postorder(AVLNode r)
    {
        if (r != null)
        {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data +" ");
        }
    }
}
//Main class which will test all the thing
public class TestTree
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        AVLTree avlt = new AVLTree();
        System.out.println("AVLTree Tree Test\n");
        char ch;
        do
        {
            System.out.println("\nAVLTree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("5. clear tree");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    avlt.insert( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result : "+ avlt.search( scan.nextInt() ));
                    break;
                case 3 :
                    System.out.println("Nodes = "+ avlt.countNodes());
                    break;
                case 4 :
                    System.out.println("Empty status = "+ avlt.isEmpty());
                    break;
                case 5 :
                    System.out.println("\nTree Cleared");
                    avlt.makeEmpty();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /* Display tree */
            System.out.print("\nPost order : ");
            avlt.postorder();
            System.out.print("\nPre order : ");
            avlt.preorder();
            System.out.print("\nIn order : ");
            avlt.inorder();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
