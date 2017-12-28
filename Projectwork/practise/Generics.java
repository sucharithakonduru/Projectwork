package practise;

public class Generics<Gen> {
	
	private Gen a;
	
	public Gen get() {
		return a;
		}
	public void set(Gen b) {
		this.a=b;
	}
	
	public static void main(String[] args) {
	  Generics type=new Generics();
	  type.set("abc");
      System.out.println(type.get());
      
      type.set(100);
      System.out.println(type.get());
      
      type.set(20.50);
      System.out.println(type.get());
      
      Generics<String> type1=new Generics<String>();
      type1.set("string");
      System.out.println(type1.get());
      
    //  type1.set(100);
     
      

      
	}

}
