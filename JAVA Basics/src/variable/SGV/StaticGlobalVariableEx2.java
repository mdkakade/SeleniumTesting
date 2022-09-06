package variable.SGV;

public class StaticGlobalVariableEx2 {
static int age;
static boolean res;
static char grade;
static float roi;

	public static void main(String[] args) {
	System.out.println(age);
	System.out.println(res);
	System.out.println(grade);
	System.out.println(roi);
	//Initialization of Static global variables
	age=25;
	res=true;
	grade='A';
	roi=7.75f;
	System.out.println(age);
	System.out.println(res);
	System.out.println(grade);
	System.out.println(roi);

	}

}
