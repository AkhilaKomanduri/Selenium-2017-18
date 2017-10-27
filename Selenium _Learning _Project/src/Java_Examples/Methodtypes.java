package Java_Examples;


public class Methodtypes {
// type1: No arguments and no return type
void method1( )
{
System.out.println("method1");
}
// type2: Only arguments
void method2(int a, int b)
{
System.out.println(a+b);
}
// type3: only return
boolean method3()
{
return false;
}
// type4: Arguments and Return
int method4(int a, int b)
{
int c=a+b;
return c;
}
public static void main(String[] args)
{
	Methodtypes x=new Methodtypes();
x.method1();
x.method2(10, 20);

boolean value=x.method3();
System.out.println(value);
int res=x.method4(50, 60);
System.out.println(res);
}
}
