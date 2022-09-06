package variable.SGV;

public class StaticGlobalVariableEx3 {
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

	//Standard method
	StaticGlobalVariableEx3.age=25;
	StaticGlobalVariableEx3.res=true;
	StaticGlobalVariableEx3.grade='A';
	StaticGlobalVariableEx3.roi=7.75f;
	System.out.println(StaticGlobalVariableEx3.age);
	System.out.println(StaticGlobalVariableEx3.res);
	System.out.println(StaticGlobalVariableEx3.grade);
	System.out.println(StaticGlobalVariableEx3.roi);
	}

}
