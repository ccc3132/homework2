import java.util.*;
class A04{

		int avg = 0;
		int sum = 0;


           public static void main(String[] args)
	   {
	          new A04().start(); 
	   }

	   void start(){
	          Scanner s = new Scanner(System.in);
	          System.out.print("국어점수를  입력하세요:");
		  int korea = s.nextInt();
	          System.out.print("영어점수를  입력하세요:");
		  int Eng = s.nextInt();
	          System.out.print("수학점수를  입력하세요:");
	          int math = s.nextInt();

		  

	   	this.sum = korea+Eng+math;
		this.avg = sum/3;
	   	print();
	   }


	   void print(){
	   
	
	        
			System.out.println("입력하신 점수의 총점은 " +sum+ " 입니다");
		
			System.out.println("입력하신 점수의 평균은 " +avg+ "입니다");
			
	   
	   }

}

