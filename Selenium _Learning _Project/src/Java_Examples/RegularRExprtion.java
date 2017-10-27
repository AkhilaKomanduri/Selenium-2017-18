package Java_Examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularRExprtion {

		//private static object content;
		public static boolean Ex1(String pattern,String content)
		{
			//create pattern object
			Pattern r = Pattern.compile(pattern);
			//now create matched object
			Matcher m = r.matcher(content);
			if(m.matches())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	public static void main(String[]args)
	{
		boolean res = Ex1("^[0-9]{10}","0123456789");
				System.out.println(res);
	}
	}
	


