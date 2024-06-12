import java.util.Scanner;
class Matrix4
{
public static void main(String args[])
{
int a[][]=new int[3][3];
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
int uppersum=0; lowersum=0;
for( int i=0;i<3;i++)
{
for( int j=0;j<3;j++)
{
if(i<j)
{
lowersum=lowersum+arr[i]+[j]
}
else if(i<j)
{
uppersum=uppersum+arr[i]+[j]
}
}
}
System.out.println("sum of upper triangle"="+uppersum+"\n"+"sum of lower triangle="+"lowersum");
}
}
