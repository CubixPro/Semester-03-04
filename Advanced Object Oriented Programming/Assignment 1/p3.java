import java.util.*;

class ThirdClass{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int cm = sc.nextInt();
		double inches = cm/2.54;
		double foot = cm/30.5;
		if(foot >= 1){
			System.out.println((int)foot + " feet and " + (cm - (int)foot * 30.5)/2.54 + " inches");
			}
		else
		{
			 System.out.println(inches + " inches");
		}
	}
}
