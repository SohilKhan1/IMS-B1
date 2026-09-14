package Lecture6;

public class StringDemo2 {
	public static void main(String[] args) {
		String s = "hello";
//		arr.length
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('o'));
		System.out.println(s.equalsIgnoreCase("Hello"));
		System.out.println(s.concat("abc"));
		System.out.println(s.contains("eg"));
		System.out.println(s.lastIndexOf('l'));
		System.out.println(s.replace('h', 'k'));
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(1));
		System.out.println(s.substring(1,5));
	}

}
