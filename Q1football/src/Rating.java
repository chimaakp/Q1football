import java.util.Scanner;

public class Rating {
	public static void main(String[] args) {
		double[] vars = getInputs();
		double TD = vars[0];
		double Yards = vars[1];
		double INT = vars[2];
		double comp = vars[3];
		double ATT = vars[4];
	
		
		double a = ((vars[3] / vars[4]) - .3) * 5;
		double b = ((vars[1] / vars[4]) - 3) * .25;
		double c = (vars[0] / vars[4]) * 20;
		double d = 2.375 - (vars[2] / vars[4]) * 25;
		double PR = (a + b + c + d) / 6;
		
		PR *= 100;
		System.out.println("The QB's Passer Rating is "  + PR);
	}
	
	public static double getArg() { //Getting inputs for main function
		Scanner input = new Scanner(System.in);
		double var = input.nextDouble(); // convert to short
		//input.close();
		return var; //return the short
	}
	public static double[] getInputs() { 
		double[] vals = new double[5];
		System.out.println("Number of Touchdowns");
		vals[0] = getArg();
		System.out.println("Passing Yards");
		vals[1] = getArg();
		System.out.println("Interceptions");
		vals[2] = getArg();
		System.out.println("Completions ");
		vals[3] = getArg();
		System.out.println("Attempted Passes");
		vals[4] = getArg();
		return vals;
	}	
}
