class Demo_Throw
{
public static void eligible(int a)
{
if(a<18)
{
throw new ArithmeticException("Not eligible to vote");
}
else
{
System.out.println("Welcome to vote");
}
}
public static void main(String args[])
{
eligible(16);
}
}