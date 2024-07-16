package week1.day2;

public class OperatorsClass {
	
	public static void main(String[] args){
		
		//Arithmetic operations
		
		int a=13;
		int b=5;
		
		//1. add
		
		System.out.println("sum of a and b is "+(a+b)); 
		
		//2.sub
		
		System.out.println("sub of a and b "+(a-b));
		
		//3. mul
		
		System.out.println(a*b);
		
		//4. div
		
		System.out.println(a/b);
		
		//5. mod
		
		System.out.println(a%b);
		
		
		//Comparison Operator
		
		//greater than
		System.out.println(a>b);
		//smaller than 
		
		System.out.println(a<b);
		
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//equals to
		
		System.out.println(a==b);
		
		//not equals to
		
		System.out.println(a!=b);
		
		
		// && || Logical
		
		//&&
		
		System.out.println(a>b && a==b);
		
	//or ||
		
		System.out.println(a>b || a==b);
		
		// not !
		
		System.out.println(a);
		
		// Increment(post, pre) and Decrement(post pre) operators

		//post
		
		System.out.println(a++); 
		
		System.out.println(a);
		
		//pre
		
		System.out.println(++a);
		
		//post dec
		
		System.out.println(a--);
		System.out.println(a);
		
		//pre dec
		
		System.out.println(--a);
}

}