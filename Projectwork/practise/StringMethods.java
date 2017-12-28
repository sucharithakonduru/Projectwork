package practise;

public class StringMethods {

	public static void main(String[] args) {
		String str="This is the test string";
		String str1="Hello";
		String str2="Hello";
		String str3=" World ";
		int[] array1= {10, 20, 30};
		String[] strarr= {"tom", "jerry", "dog"};
		
		int len=strarr.length;
		System.out.println(len);
		for(int i=0; i<=len-1;i++) {
			
			System.out.println(strarr[i]);
		}
		
		System.out.println(array1[0]);
		System.out.println(array1[2]);
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.concat(" Sucharitha"));
		System.out.println(str.contains("is"));
		System.out.println(str.contains("hello"));
		System.out.println(str.startsWith("Th"));
		System.out.println(str.startsWith("si"));
		System.out.println(str.endsWith("ng"));
		System.out.println(str.endsWith("i"));
		System.out.println(str.equals(str1));
		System.out.println(str1.equals(str2));
		System.out.println(str.indexOf("t"));
		System.out.println(str1.isEmpty());
		System.out.println(str3.trim());
		System.out.println(str3.replace('W','b'));
		System.out.println(str.substring(10));
		
		char[] charArray = str1.toCharArray();
		System.out.println(charArray);
		for(int i=0; i<charArray.length;i++) {
			
			System.out.println("Index of " + i+ " is "+charArray[i]);
		}
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		
		
	}

}
