package determinants;

public class Multiply 
{
	Matrix_input a=new Matrix_input();
	Matrix_input b=new Matrix_input();
	int ans[][]=new int[100][100];
	void input()
	{
		a.scan();
		b.scan();
	}
	void  mul()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++) 
			{
				for(int k=1;k<=3;k++)
				{
					ans[i][j]+=(a.n[i][k] * b.n[k][j]);
				}
				
			}
			
		}
	}
	
	void solve()
	{
		mul();
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
