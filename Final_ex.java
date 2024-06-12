final class Parent
{
final int COUNT=100;
final void disp()
{
COUNT=COUNT+100;
System.out.println("value is"+COUNT);
}
}
class Child extends Parent
{
void disp()
{
System.out.println("child class method");
}
}
class Final_ex
{
public static void main(String args[])
{
Child obj=new Child();
obj.disp();
}
}
