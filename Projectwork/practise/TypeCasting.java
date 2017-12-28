package practise;

public class TypeCasting {

	public static void main(String[] args) {
		
		double d = 1000.30;
		int i = (int) d;
		System.out.println(i);
		
		String array[] = {"Ron", "Harry", "Hermoine"};
		System.out.println(array.hashCode());
		String array2[]=array.clone();
		System.out.println(array2.hashCode());
		
	 for (String x : array) {
		 
		 System.out.println(x);
			
		}
	
	}
}
