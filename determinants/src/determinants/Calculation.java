package determinants;
public class Calculation 
{
	Matrix_input a=new Matrix_input();
	void input()
	{
		a.scan();
	}
	int three(int k)
	{
		int res=0;
		for(int h=1;h<=3;h++)
		{
			int x[]=new int[5];
			for(int i=1,f=1;i<=3;i++)
			{
				if(i==1)continue;
				for(int j=1;j<=3;j++)
				{
					if(j==h)continue;
					x[f]=a.n[i][j];
					f++;
				}
			}
			//System.out.println(x[1]+" "+x[2]+"\n"+x[3]+" "+x[4]);
			if(h%2==1)
		    res+=h*((x[1]*x[4])-(x[2]*x[3]));	
			else res-=h*((x[1]*x[4])-(x[2]*x[3]));
			//System.out.println(res+"\n");
		}
		//System.out.println(res);
		return res;
	}
	void solve()
	{
		System.out.println(three(1));
	}
	
}
