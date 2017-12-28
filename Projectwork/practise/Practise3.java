package practise;

public class Practise3 {
	
	double r;

	public void insert(int radius) {
		
		r=radius;
	}
	
	public double area() {
		
		return 3.14*r*r;
	}
    public double perimeter() {
		
		return 2*3.14*r;
	}
	public static void main(String[] args) {
	
		Practise3 p3=new Practise3();
		p3.r= 7.5;
		System.out.println(p3.area());
		System.out.println(p3.perimeter());
		

	}

}
