class Crow
{
public static void main(String args[])
{
int i,j;
for(i=1;i<=5;i++)
{
for(j=i;j<=5;j++)
{
System.out.print(" ");   
}
for(j=1;j<=2*i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}