package determinants;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Calculation of 3*3 Matrix");
		System.out.print("if multiply enter 1\n" + "if determinant enter 2\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1)
		{
			
			Multiply m=new Multiply();
			m.input();
			m.solve();
		}
		else if(n==2)
		{
			Calculation c=new Calculation();
			c.input();
			c.solve();
			
		}
		else {
			System.out.println("Wrong key!!");
		}
	}

}
