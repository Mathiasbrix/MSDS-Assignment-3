package math_expression;

public class Test27 {
	public int x;
	public int y;
	
	private External external;
	
	public Test27(External external) {
		this.external = external;
	}
	public void compute() {
		x = dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@6598a895();
		y = dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@6598a895() + 2;
	}
	
	interface External {
	    public int sqrt(int n);
	  }
}
