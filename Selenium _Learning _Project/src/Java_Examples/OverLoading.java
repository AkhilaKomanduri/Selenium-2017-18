package Java_Examples;

public class OverLoading {

	public static void method()
	{
		System.out.println("method1");
	}
public void method(int a)
{
	System.out.println(a);
}
public void method(String str)
{
	System.out.println(str);
}
public void method(String a, String b)
{
	System.out.println(a+b);
	
}
public void method(int a, int b)
{
	System.out.println(a+b);
}
public static void main(String[]args)
{
	OverLoading obj = new OverLoading();
	obj.method();
	obj.method(10);
	obj.method("Akhila");
	obj.method("Ravi","Akhila");
	obj.method(10, 20);
}
}
