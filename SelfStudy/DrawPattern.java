/*Write a program to print following pattern
    5
    5 4
    5 4 3
    5 4 3 2
    5 4 3 2 1*/
package selfStudy;

public class DrawPattern {
	
	public static void main(String[] args)
	{
		int rows = 5;
		for(int i = rows; i>=1;i--) // to indicate/point a row
		{
			for (int j = rows; j>=i;j--) //to write columnwise in an indicated row
			{
				System.out.print(""+j);
			}
			System.out.println();
		}
	}
	

}
