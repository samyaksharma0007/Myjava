public class ExceptionExample
{
public static void validAge(int age) throws IllegalArgumentException
{
if(age<18)
{
throw new IllegalArgumentException("Age must be 18 or above to vote");
}
else
{
System.out.println("Eligible to vote");
}
}
public static void main(String args[])
{
try
{
validAge(16);
}
catch(IllegalArgumentException e)
{
System.out.println("Exception caught"+e.getMessage());
}
try
{
validAge(20);
}
catch(IllegalArgumentException e)
{
System.out.println("Exception caught"+ e.getMessage());
}
}
}