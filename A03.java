import java.util.*;
class A03{

		int seconds = 0;


           public static void main(String[] args)
	   {
	          new A03().start(); 
	   }

	   void start(){
	          Scanner s = new Scanner(System.in);
	          System.out.print("날수를  입력하세요:");

		  int days = s.nextInt();

	   	this.seconds = days *24 *60 *60;
	   	print();
	   }


	   void print(){
	   
	
	        
			System.out.println("날수에 해당되는 기간은 모두" +seconds+ "초 입니다");
		
			
	   
	   }

}

