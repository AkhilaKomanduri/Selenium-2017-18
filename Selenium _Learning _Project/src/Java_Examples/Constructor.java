package Java_Examples;

public class Constructor {

	public Constructor()
	{
		System.out.println("Zero Arguments Constructor");
	}
public Constructor(String str)
{
	System.out.println("Arguments Constructor");
	System.out.println(str);
}
public static void main(String[]args)
{
Constructor c = new Constructor();
Constructor s = new Constructor("Selenium");
}
}
