import java.util.*;
class A01{

		int age = 0;


           public static void main(String[] args)
	   {
	          new A01().start(); 
	   }

	   void start(){
	          Scanner s = new Scanner(System.in);
	          System.out.print("태어난년도를 입력하세요.:");

		  int year = s.nextInt();

	   	this.age = 2014 - year +1;
	   	print();
	   }


	   void print(){
	   
	
	        if(age < 20)
			System.out.println("미성년자입니다.");
		else
			System.out.println("미성년자가 아닙니다.");
	   
	   }

}

