package DailyPractice;

public class july01 {
	// Declaring and Initailizing Static Global Variable
	static int l=12;
	static float dia = 0.25f;
	static float pi=3.14f;
	static float area;
	static float volume;
	//Declaring and initializing Nonstatic Global Variable
	int n=125;
	
	
	public static void main(String[] args) {
		//Acessing static variables directly from main() because static members can access other static members directly
		System.out.println("Program Starts");
		area=pi/4*(dia*dia);
		System.out.println("Area of the Cylinder is :"+area);
		volume=area*l;
		System.out.println("Volume of the Cylinder is :"+volume);
		System.out.println("Program Ends");

		//Acessing static variables in Standard way using class name
		System.out.println("Program Starts");
		july01.area=pi/4*(dia*dia);
		System.out.println("Area of the Cylinder is :"+july01.area);
		july01.volume=area*l;
		System.out.println("Volume of the Cylinder is :"+july01.volume);
		System.out.println("Program Ends");
		
		//To Access NSGV first create object of the class
		july01 ref1=new july01();
		// Access the NSGV using the ref variable
		System.out.println("Number of cylinders is :"+ref1.n);
		System.out.println("Total Area of all cylinders is :"+ref1.n*area);
		System.out.println("Total Volume of all cylinders is :"+ref1.n*july01.volume);
		
		

	}

}
