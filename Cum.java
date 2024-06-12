import java.util.*;
class Cum
{
public static void main(String args[])
{
int a,b;

char op;

Scanner sc=new Scanner(System.in);
System.out.println("enter number in a");
a=sc.nextInt();
System.out.println("enter number in b");
b=sc.nextInt();
System.out.println("enter operator");
op=sc.next().charAt(0);
switch(op)
{
case'+':
System.out.println("addition is"+(a+b));
break;
case'-':
System.out.println("sub is"+(a-b));
break;
case'*':
System.out.println("multi is"+(a*b));
break;
case'/':
System.out.println("div is"+(a/b));
break;
default:
System.out.println("invalid");
break;
}
}
}