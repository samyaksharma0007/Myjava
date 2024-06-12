interface Myinterface
{
abstract void myMethod();
}
class Myclass implements Myinterface
{
public void myMethod()
{
System.out.println("MyMethod implementation");
}
}
public class Main
{
public static void main(String args[])
{
Myinterface obj=new MyClass();
obj.myMethod();
}
}