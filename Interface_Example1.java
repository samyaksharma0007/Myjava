interface A
{
abstract public void dispa();
}
interface B
{
abstract public void dispb();
}
class C implements A,B
{
public void dispa()
{
System.out.println("Pranshu BC");
}
public void dispb()
{
System.out.println("Puneet Superstar");
}
}
class Interface_Example1
{
public static void main(String args[])
{
C obj=new C();
obj.dispa();
obj.dispb();
}
}