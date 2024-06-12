import java.util.*;
class SmallLoop
{
public static void main(String args[])
{
int m1,m2,m3,m4,per;
Scanner sc=new Scanner(System.in);

System.out.println("Enter student 4 subject marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
per=(m1+m2+m3+m4)/4;
if(per>=75)
{
System.out.println("SCIENCE");
}
else if(per>=60)
{
System.out.println("FIRST");
}
else if(per>=50)
{
System.out.println("SECOND");
}
else if(per>=40)
{
System.out.println("THIRD");
}
else
{
System.out.println("US Moment");
}
}
}