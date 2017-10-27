package Java_Examples;

public class StaticMethod {

	public static void Method1()
	{
		System.out.println("Method1");
	}
	public static void method2(int a)
	{
		System.out.println(a);
	}
    public static Boolean method3()
    {
    	return true;
   
    }
    public static int method4(int a,int b)
    {
    	return a+b;
    }
    public static void main(String[]args)
    {
    	Method1();
    	method2(10);
    	Boolean bln = method3();
    	System.out.println(bln);
    	int res = method4(5000,9654);
    	System.out.println(res);
    
    	
    	
    }
}
