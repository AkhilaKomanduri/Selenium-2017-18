package Java_Examples;

public class JavaInMethods {

	public static void main(String[] args) {
		String x ="AKHILAKOMANDURI";
		//TO CONVERT TO SMALL LETTERS
		System.out.println(x.toLowerCase());
		//TO CONVERT TO CAPITAL LETTERS
System.out.println(x.toUpperCase());
//get sub string from main string
System.out.println(x.substring(6));
//Get scr from x.sub string(starting index,length)
//get.Komanduri
System.out.println(x.substring(0,6));
//replace
System.out.println(x.replace("AKHILA", "Ravi"));
String y =" sahiti ";
System.out.println(y);
//to remove space from either left side or right side
System.out.println(y.trim());
String srt = "AkhilaxKomandurixMrs";
String[] a = srt.split("x");
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);
//To convert string digit to int
String c ="10";
int b = Integer.parseInt(c);
System.out.println(b);




	}

}
