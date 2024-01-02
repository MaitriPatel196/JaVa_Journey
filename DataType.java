package demo;

// Data types and toString() methods 

public class DataType {
	public static void main(String[] args) {
		int a= 1; 
		String str ="Maitri";
		String str2 ="Maitri";
		String str3 = new String("Maitri");
		String str4 = "Hello! How are you?";
		String str5="";
		String str6=" Maitri        ";
		System.out.println("Comparison of the string" + " " + (str == str2));
		System.out.println("Comparison of the string" + " " + (str == str3));
		System.out.println("Comparison of the string" + " " + str.equals(str3));
		System.out.println(a);
		System.out.println("Position of the character at string" + " " + str4.charAt(0));
		System.out.println("Length of the string" + " " + str4.length());
		System.out.println("substring" + " " + str4.substring(0,5) + " " + str);
		System.out.println(str4.contains("are"));
		System.out.println(str5.isEmpty());
		System.out.println(str4.concat(str2));
		System.out.println(str.replace('i', 'a'));
		System.out.println("String uppercase" + " " + str.toUpperCase());
		System.out.println("String uppercase" + " " + str.toLowerCase());
		System.out.println(str.toUpperCase().equalsIgnoreCase(str));
		String[] arr= str4.split(" ");
		for(String arr2:arr)
		System.out.println(arr2);
		System.out.println(str4.indexOf('a'));
		System.out.println("Before trim:" + str6 + "\n" + "After trim:" + str6.trim());
		System.out.println(String.valueOf(a)); // Convert any non string variables or object like int, long...... to a string object
		
	} 
}
