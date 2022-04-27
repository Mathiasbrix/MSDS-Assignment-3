package math_expression;

public class Test28 {
	public int x;
	public int y;
	
	private External external;
	
	public Test28(External external) {
		this.external = external;
	}
	public void compute() {
		x = dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@6530110d(4);
		y = dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@6530110d(4) * 2;
	}
	
	interface External {
	    public int sqrt(int n);
	  }
}
