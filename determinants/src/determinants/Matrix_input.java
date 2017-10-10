package determinants;
import java.util.Scanner;

public class Matrix_input
{
	Scanner sc=new Scanner(System.in);
	public int n[][]=new int[100][100];
	
	void scan()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				n[i][j]=sc.nextInt();
			}
		}
	}
}
