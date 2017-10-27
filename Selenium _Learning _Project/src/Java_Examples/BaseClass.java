package Java_Examples;

 class SuperClass {

	public void method1()
	{
		System.out.println("Method1");
	}
	public void method2()
	{
		System.out.println("Method2");
	}
}
public class BaseClass extends SuperClass
{
	public void method3()
	{
		System.out.println("Method3");
	}
	public static void main(String[]args) {
		BaseClass x = new BaseClass();
		x.method1();
		x.method2();
		x.method3();
		
	}
}