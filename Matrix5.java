import java.util.Scanner;
class Matrix5
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter 9 numbers\n");
for( int i=0;i<3;i++)
{
for( int j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.print("Enter 9 numbers\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("Array elements are\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
}
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
System.out.println("Array elements are\n");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print( c[i][j]+"\t");
}
System.out.println();
}
}
}
