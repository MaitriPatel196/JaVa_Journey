package demo;

public class PracticeClass {
	static int i =10;
	public static void main(String[] args) {
		PracticeClass ps = new PracticeClass();
		System.out.println(ps.sum());	
		System.out.println(ps.sum(3,5));
		System.out.println(ps.sum(1,8,6,4,2));
		
	}
	private int sum(int... intArgs) {
		int sum = 0;
		for(int data : intArgs)
			sum += data;
		System.out.println("Varargs");
		return sum;
	}
	private int sum(int a, int b) {
		System.out.println("Sum");
		return a+b;
	}

}
