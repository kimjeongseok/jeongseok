import java.util.Scanner;
public class Student extends Person {																	//�ʵ�
	public String school;																				//�б���
	public String department;																			//�а�
	public int number;																					//�й�
	public double[] score = new double[8];																//8���б� �������
	
	public Student(String name, int age, String address, String school,String department,int number) {	//������
		super(name,age,address);
		this.school = school;
		this.department = department;
		this.number = number;
	}
	public double average() {																			//�޼ҵ� average
		double average = (score[0]+score[1]+score[2]+score[3]+score[4]+score[5]+score[6]+score[7])/8;	//��� ���
		return average;
	}
	public static void main(String[] args) {
		Student myStu = new Student("�����",20,"����� ���Ǳ�","���缭����б�","���������а�",20132222);				//��ü ����
		double score;
		System.out.println("�̸� : "+myStu.name);															//�̸����
		System.out.println("���� : "+myStu.age);															//�������
		System.out.println("�ּ� : "+myStu.address);														//�ּ����
		System.out.println("�б� : "+myStu.school);														//�б����
		System.out.println("�а� : "+myStu.department);													//�а����
		System.out.println("�й� : "+myStu.number);														//�й����
		System.out.println("--------------------------------");
		System.out.println("8�б� ������ ������� �Է��ϼ���");
		for(int i=0; i<8; i++) {																		//i�� 0���� 8����1�� �����ϸ鼭	
			System.out.print(i+1 + "�б� ���� -> ");														
			Scanner input = new Scanner(System.in);														//��ĳ�ʷ� ������ �ϳ��� �ް�
			score = input.nextDouble();
			myStu.score[i] = score;																		//score[i]�� �ϳ��� �����Ѵ�
		}
		System.out.println("--------------------------------");
		System.out.print("8�б� �� ��� ������ " + myStu.average() + "�Դϴ�.");									//��� ���� ���
	}
}