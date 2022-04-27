package math_expression;

public class Test30 {
	public int x;
	
	private External external;
	
	public Test30(External external) {
		this.external = external;
	}
	public void compute() {
		x = dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@2f7815dd(dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@649e213d(dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@56e98889(),2));
	}
	
	interface External {
	    public int sqrt(int n);
	  }
}
