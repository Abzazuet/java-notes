public class IntOps{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a+b;
		int product = a*b;
		int division = a/b;
		int remaining = a%b;
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " * " + b + " = " + product);
		System.out.println(a + " / " + b + " = " + division);
		System.out.println(a + " % " + b + " = " + remaining);
		System.out.println(a + " = " + division + " * " + b + " + " + remaining);
	}
}
