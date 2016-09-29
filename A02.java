import java.util.*;
class A02{

		double hwa,sub,input_degree= 0.0;
		double kind = 0;
		
		
		

           public static void main(String[] args)
	   {
	          new A02().start(); 
	   }

	   void start(){
	          Scanner s = new Scanner(System.in);
	          System.out.print("온도를 입력하세요");

		  this.input_degree = s.nextInt();
		
                 System.out.print("입력하신 온도가 섭씨온도이면 1를 화씨온도이면 2를 입력하세요.");
		 this.kind = s.nextInt();
		print();
	   }


	   void print(){
	   
	
	        if(kind == 1){
		hwa = input_degree *1.8+32;
	System.out.println("변환된 온도는"+hwa+"입니다.");
			}

		else if(kind == 2){
		        sub = (input_degree-32)/1.8;
	System.out.println("변환된 온도는"+sub+"입니다."); 					}
		else
		{
	System.out.print("이건 온도가 아닙니다.");
		}
			
	   
	   }

}

