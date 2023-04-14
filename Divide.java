
public class Divide extends Binop{

	public Divide(Node l, Node r) {
		super(l, r);
	}

	@Override
	public double eval() {
		return lChild.eval() / rChild.eval();
	}
	public String toString() {
		return "(" + lChild.toString() + " / " + rChild.toString() + ")";
	}

}
