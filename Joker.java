import java.util.*;
class Joker
{
public static void main(String args[])
{
int i,ele,flag=0,u=9,l=0,m;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("enter 10 array elements\n");
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
System.out.println("elements are\n");
for(i=0;i<10;i++)
{
System.out.println(a[i]+"\t");
}
System.out.println(" enter elements to be search\n");
ele=sc.nextInt();
while(l<=u)
{
m=(l+u)/2;
if(ele==a[m])
{
flag=1;
break;
}
else if(ele>a[m])
{
l=m+1;
}
else
{
u=m-1;
}
}
if(flag==1)
System.out.println("elements found succesfully");
else
System.out.println(" element not found");
}
}