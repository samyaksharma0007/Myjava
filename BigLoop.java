import java.util.*;
class BigLoop
{
public static void main(String args[])
{
int a,b,c,big;
Scanner sc=new Scanner(System.in);

System.out.println("Enter a number");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b)
{
   if(a>c)
{
big=a;
}
else
{
big=c;
}
else
{
if(b>c)
{
big=b;
}
else
{
big=c;
}
}
System.out.println("biggest value is:"+big);
}
}
}