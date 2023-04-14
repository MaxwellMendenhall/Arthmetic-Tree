/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Submission by:
 * Date:
 * Purpose: Test the Plus Binop
 */

import java.util.Random;

public class TestArithmetic {
    static Random rand = new Random();

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            Node node = randOperator(randOperator(randConstant(), randConstant()), randOperator(randConstant(), randConstant()));
            System.out.println(node + " = " + node.eval());
        }
    }
    public static Binop randOperator(Node l, Node r) {
        int randInt = rand.nextInt(4) + 1;
        switch(randInt) {
        case 1: return new Plus(l,r);
        case 2: return new Divide(l,r);
        case 3: return new Minus(l,r);
        case 4: return new Mult(l,r);
        }
        return null;
            
    }
    public static Node randConstant() {
        int constant = rand.nextInt(20) + 1;
        
        return new Const(constant);
    }
}
