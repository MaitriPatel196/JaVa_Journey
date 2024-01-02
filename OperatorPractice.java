package demo;


public class OperatorPractice {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 2;
		OperatorPractice op= new OperatorPractice();
		String s="Maitri";
		System.out.println("Pre-inc: " + a++ + " " + "Post-inc: " + ++a);
		int d=a+b-c*a/b;
		System.out.println(d);
		int e= a+ (++b) -(c--) * a / c + d;
		System.out.println(e);
		System.out.println(a>=b);
		System.out.println(c<=d);
		System.out.println(d!=e);
		System.out.println(d<=c);
		System.out.println('A'<'a');
		System.out.println(d==e);
		System.out.println(s + a + c + d);
		System.out.println(a + b + c + s);
		System.out.println(a & c);  //1
		System.out.println(a | c);  //7
		System.out.println(a ^ c);  //6
		System.out.println(~a);     //-5
		System.out.println(op instanceof OperatorPractice);
		System.out.println(s instanceof String);
		Thread thread= new Thread();
		System.out.println(thread instanceof Runnable);
//		System.out.println(a instanceof Constable);
	}

}
