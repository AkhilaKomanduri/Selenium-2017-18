package Java_Examples;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		List<String> List = new
		java.util.ArrayList<String>();
			List.add("Selinium");
			List.add("QTP");
			List.add("123");
			System.out.println(List.get(0));
			System.out.println(List.get(1));
			System.out.println(List.get(2));
			System.out.println("List size = "+ List.size());
			System.out.println("");
			System.out.println("This is for loop");
			for (int i = 0; i < List.size(); i++) {
				System.out.println(List.get(i));
			}
			System.out.println("");
			System.out.println("This is For Each Loop");
			for(String string:List)
			{
				System.out.println(string);
			}
			System.out.println("");		
	System.out.println("This is While Loop");
			Iterator<String> it = List.iterator();
			while(it.hasNext())
			{
				String StringValue = it.next();
				System.out.println(StringValue);
				
			}		
					
	
	}

}
