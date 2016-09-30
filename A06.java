import java.util.*;
class A06{



	String Name,grade = "";
	int korea,math,eng,avg;


	public static void main(String[] args)
	{
		new A06().start();
	}
		void start()
		{
	Scanner s =new Scanner(System.in);
	System.out.print("이름을 입력하세요.:");
	this.Name = s.next();
	System.out.print("국어점수를  입력하세요.:");
	this.korea = s.nextInt();
	System.out.print("수학점수를 입력하세요.:");
	this.math = s.nextInt();
	System.out.print("영어점수를 입력하세요.:");
	this.eng = s.nextInt();

	this.avg = (korea+eng+math)/3;
	print();
	
		}

	void print()
	{
   System.out.println("평균은" + avg + "입니다.");
   System.out.println(Name+"님은");
   	if(avg >= 95)
	System.out.println("학점은 A+ 입니다.");
	else if(avg >=90)
	System.out.println("학점은 A 입니다. ");
	else if(avg >=85)
	System.out.println("학점은 B+ 입니다. ");
	else if(avg >=80)
	System.out.println("학점은 B 입니다. ");

	}
}
	
