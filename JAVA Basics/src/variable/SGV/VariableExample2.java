package variable.SGV;
class VariableExample2
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//syntax to declare a variable: datatype variablename;
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVariable;
		char charVariable;
		boolean booleanVariable;		
		//Syntax to initlize a variable: variablename = value;
		byteVariable = 25;//-10 | -89
		shortVariable = 50;//-10 | -89
		intVariable = 150;//-10 | -89
		longVariable = 2530l;//-10 | -89 | 25
		floatVariable = 25.36f;//25 | -69 |5454 | 0.25f
		doubleVariable = 36.56d;//25 | -69 |54.54 | 0.256
		charVariable = 'A';//'a' | 'Z'
		booleanVariable = true;//true | false
		//print all the varibale value inthe console
		System.out.println("byteVariable");
		System.out.println(byteVariable);
		System.out.println(shortVariable);
		System.out.println(intVariable);
		System.out.println(longVariable);
		System.out.println(floatVariable);
		System.out.println(doubleVariable);
		System.out.println(charVariable);
		System.out.println(booleanVariable);
		System.out.println("Program ends");
	}
}
