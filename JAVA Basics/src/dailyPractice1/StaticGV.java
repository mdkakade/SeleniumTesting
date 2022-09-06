package dailyPractice1;

public class StaticGV {
	static int a=10,b,c;

	public static void main(String[] args) {
		//Default values
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);
		
		//Updating values
		b=25;c=a+b;
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);
		
		//Updating values
		a=50;b=c-a;c=25;
		System.out.println("a"+StaticGV.a);
		System.out.println("b"+StaticGV.b);
		System.out.println("c"+StaticGV.c);
		
		int   res=(a+b)*c;
		System.out.println("res"+res);
	}

}
