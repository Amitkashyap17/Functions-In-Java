import java.util.*;
public class Functions {
	
	
	//To Print Name using function.
	public static void printMyName(String name){
		System.out.println(name);
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		printMyName(name);
	}
	
	
	
	//To print sum of two number using function.
	public static int calculateSum(int a, int b){
		int sum = a+b;
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = calculateSum(a,b);
		System.out.println("Sum of "+ a + " and " + b +" is : "+sum);
	}
	
	
	//To print multiply of two number using function.
	public static int calculateProduct(int a, int b){
		int mux = a*b;
		return mux;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int mux = calculateProduct(a,b);
		System.out.println("Product of "+ a + " and " + b +" is : "+mux);
	}
}
