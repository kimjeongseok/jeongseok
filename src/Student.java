import java.util.Scanner;
public class Student extends Person {																	//필드
	public String school;																				//학교명
	public String department;																			//학과
	public int number;																					//학번
	public double[] score = new double[8];																//8개학기 평균평점
	
	public Student(String name, int age, String address, String school,String department,int number) {	//생성자
		super(name,age,address);
		this.school = school;
		this.department = department;
		this.number = number;
	}
	public double average() {																			//메소드 average
		double average = (score[0]+score[1]+score[2]+score[3]+score[4]+score[5]+score[6]+score[7])/8;	//평균 계산
		return average;
	}
	public static void main(String[] args) {
		Student myStu = new Student("김다정",20,"서울시 관악구","동양서울대학교","전산정보학과",20132222);				//객체 생성
		double score;
		System.out.println("이름 : "+myStu.name);															//이름출력
		System.out.println("나이 : "+myStu.age);															//나이출력
		System.out.println("주소 : "+myStu.address);														//주소출력
		System.out.println("학교 : "+myStu.school);														//학교출력
		System.out.println("학과 : "+myStu.department);													//학과출력
		System.out.println("학번 : "+myStu.number);														//학번출력
		System.out.println("--------------------------------");
		System.out.println("8학기 학점을 순서대로 입력하세요");
		for(int i=0; i<8; i++) {																		//i가 0에서 8까지1씩 증가하면서	
			System.out.print(i+1 + "학기 학점 -> ");														
			Scanner input = new Scanner(System.in);														//스캐너로 학점을 하나씩 받고
			score = input.nextDouble();
			myStu.score[i] = score;																		//score[i]에 하나씩 저장한다
		}
		System.out.println("--------------------------------");
		System.out.print("8학기 총 평균 평점은 " + myStu.average() + "입니다.");									//평균 평점 출력
	}
}