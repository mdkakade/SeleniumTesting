package operations;

public class unaryop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1, b;
		b = a++ + ++a + ++a + a;
	
		System.out.println("a: "+a);// 
		System.out.println("b: "+b);//
		System.out.println("**********************");
		a = 7;
		b = a-- + --a + --a + a;
	
		System.out.println("a: "+a);//
		System.out.println("b: "+b);// 

		a = -21;
		b = --a + --a + --a + a + ++a + a++;//
		
		System.out.println(a);// 
		System.out.println(b);// 

		a = -5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
		
		System.out.println(a);//
		System.out.println(b);//
	}

}
