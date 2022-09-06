package variable.SGV;

public class StaticGlobalVariableEx4 {
static int age=25;
static boolean res;
static char grade='M';
static float roi;
	public static void main(String[] args) {
	System.out.println("Value of age is: "+age);
	System.out.println("The default value of rs is: "+res);
	System.out.println("The value of garde is: "+grade);
	System.out.println("The default value of roi is::"+roi);
	
	// From Clasname
	System.out.println("Value of age is: "+StaticGlobalVariableEx4.age);
	System.out.println("The default value of rs is: "+StaticGlobalVariableEx4.res);
	System.out.println("The value of garde is: "+StaticGlobalVariableEx4.grade);
	System.out.println("The default value of roi is::"+StaticGlobalVariableEx4.roi);
	
	// Initialization of Static Global Variables
	StaticGlobalVariableEx4.age=35;
	StaticGlobalVariableEx4.res=true;
	StaticGlobalVariableEx4.grade='k';
	StaticGlobalVariableEx4.roi=7.75f;
	System.out.println("Updated Value of age is: "+StaticGlobalVariableEx4.age);
	System.out.println("Updated The default value of rs is: "+StaticGlobalVariableEx4.res);
	System.out.println("Updated The value of garde is: "+StaticGlobalVariableEx4.grade);
	System.out.println("Updated The default value of roi is::"+StaticGlobalVariableEx4.roi);
	}

}
