import java.util.*;
class Ramesh
{
public static void main(String args[])
{
int a[]=new int[10];
int i,even=0,odd=0,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 10 number\n");
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
if(a[i]%2==0)
{
even=even+1;
}
else if(a[i]%2!=0)
{
odd=odd+1;
}
System.out.println("ARRAY ELEMENTS ARE\n ");
for(i=0;i<10;i++)
{
System.out.print(a[i]+"\t");
}
System.out.println("even= " +even);
System.out.println("odd= " +odd);
System.out.println("sum= " +sum);
}
}
