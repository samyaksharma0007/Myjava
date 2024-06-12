import java.util.Scanner;
class Matrix
{
public static void main(String args[])
{
int a[][]=new int[3][3]rdhgn
;
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter 9 numbers\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Array elements are\n");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}