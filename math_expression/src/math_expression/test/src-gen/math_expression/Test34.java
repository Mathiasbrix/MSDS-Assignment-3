package math_expression;

public class Test34 {
	public int sideA;
	public int sideB;
	public int sideC;
	public int perimeterTriangle;
	public int radius;
	public int perimeterCircle;
	
	private External external;
	
	public Test34(External external) {
		this.external = external;
	}
	public void compute() {
		sideA = 3;
		sideB = 4;
		sideC = dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@544ba2(dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@10f27fd(3,2) + dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@106702f6(4,2));
		perimeterTriangle = 3 + 4 + dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@544ba2(dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@10f27fd(3,2) + dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@106702f6(4,2));
		radius = 5;
		perimeterCircle = 2 * 5 * dk.sdu.mmmi.mdsd.math.impl.FunctionCallImpl@476d7b88();
	}
	
	interface External {
	    public int sqrt(int n);
	  }
}
