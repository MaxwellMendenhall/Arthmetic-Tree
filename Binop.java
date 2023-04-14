/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Purpose: A root class for holding binary operators
 *          for Arithmetic evaluation
 */
public abstract class Binop extends Node {
    /** the left child node */
    protected Node lChild;
    /** the right child node */
    protected Node rChild;
    /**
     * @param l the left node
     * @param r the right node
     */
    public Binop(Node l, Node r) {
    	lChild = l;
        rChild = r;
    }
}
