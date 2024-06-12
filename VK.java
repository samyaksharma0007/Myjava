import java.util.*;
class VK
{
public static void main(String args[])
{
int a[]=new int[10];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter 10 number\n");
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
System.out.println("*******ARRAY ELEMENTS ARE*****\n");
for(i=0;i<10;i++)
{
System.out.print(a[i]+"\t");
}
}
}
