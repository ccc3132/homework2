import java.util.*;
class A02{

		double hwa= 0;
		double sub=0;
		

           public static void main(String[] args)
	   {
	          new A02().start(); 
	   }

	   void start(){
	          Scanner s = new Scanner(System.in);
	          System.out.print("온도를 입력하세요");

		  double input_degree = s.nextInt();

	   	this.hwa = sub * 1.8 + 32;
		this.sub = (hwa -32)/1.8;
                 System.out.print("입력하신 온도가 섭씨온도이면 C를 화씨온도이면 F를 입력하세요.");
		 String kind = s.next();
		print();
	   }


	   void print(){
	   
	
	        if(kind =='C')
			sub = input_degree;
		else if(kind =='F')
		        hwa = input_degree;
		else
		print("이건 온도가 아닙니다.");
	
			
	   
	   }

}

