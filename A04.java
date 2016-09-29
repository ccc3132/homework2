import java.util.*;
class A04{

<<<<<<< HEAD
		int avg = 0;
		int sum = 0;
		int korea = 0;
		int Eng = 0;
		int math = 0;
		String grade ="";
=======
		int avg,sum,korea,Eng,math = 0;
		 
		
		

>>>>>>> job-A
           public static void main(String[] args)
	   {
	          new A04().start(); 
	   }

	   void start(){
	          Scanner s = new Scanner(System.in);
	          System.out.print("국어점수를  입력하세요:");
		  this.korea = s.nextInt();
	          System.out.print("영어점수를  입력하세요:");
		  this.Eng = s.nextInt();
	          System.out.print("수학점수를  입력하세요:");
	          this.math = s.nextInt();
<<<<<<< HEAD

		  
=======
>>>>>>> job-A

		  

	   	this.sum = korea+Eng+math;
		this.avg = sum/3;
	   	print();
	   }


	   void print(){
	   
	
	        
  	System.out.println("입력하신 점수의 총점은 " +sum+ " 입니다");
		
	System.out.println("입력하신 점수의 평균은 " +avg+ "입니다");
	

	   
	   if(korea>=90)
	   System.out.println("국어성적은 우수합니다");
	   if(math>=90)
	   System.out.println("수학성적은  우수합니다.");
	   if(Eng>=90)
	   System.out.println("영어성적은  우수합니다.");
	   
	   

	   
	   
	   }

}

