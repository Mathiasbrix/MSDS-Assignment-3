package math_expression;

public class Test29 {
	public int x;
	public int y;
	
	private External external;
	
	public Test29(External external) {
		this.external = external;
	}
	public void compute() {
		x = dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@dcd2559(4,2);
		y = dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@dcd2559(4,2) - 2;
	}
	
	interface External {
	    public int sqrt(int n);
	  }
}
