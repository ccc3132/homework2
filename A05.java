import java.util.*;
class A05{

		int age = 0;


           public static void main(String[] args)
	   {
	          new A05().start(); 
	   }

	   void start(){
	          Scanner s = new Scanner(System.in);
	          System.out.print("태어난년도를 입력하세요.:");

		  int birth_year = s.nextInt();

	   	this.age = 2012 - birth_year +1;
	   	print();
	   }


	   void print(){
	   
		if(age<=0)
			System.out.println("태어나지 않았습니다.");
	        else if(age < 7)
			System.out.println("유아입니다.");
		else if(age<13)
			System.out.println("어린이입니다.");
		else if(age<20)
			System.out.println("청소년입니다.");
		else if(age<30)
			System.out.println("청년입니다.");
		else if(age<60)
			System.out.println("중년입니다.");
		else
		 	System.out.println("노년입니다.");

	   
	   }

}

