public class Minus extends Binop{

	public Minus(Node l, Node r) {
		super(l, r);
	}

	@Override
	public double eval() {
		return lChild.eval() - rChild.eval();
	}
	public String toString() {
		return "(" + lChild.toString() + " - " + rChild.toString() + ")";
	}

}
