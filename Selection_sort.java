import java.util.*;
class Selection_sort
{
public static void main(String args[])
{
int a[]=new int[5];
int i,j,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter 5 number\n");
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Array elements are");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Array after sorting");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}