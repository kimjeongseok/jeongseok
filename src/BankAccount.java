class InvalidWithdraw extends Exception {
   private static final long serialVersionUID = 1L;
   public InvalidWithdraw(String msg) {
      super(msg);
   }
}
class Ex02{
	int MoneyMin;                           //�ּ� �ܰ�
	int money;                              //�����ϴ� �ܰ�
	int mine = 0;                        	//���� ���� �� �ܰ�
   public Ex02(int minMoney) {              //������
      this.MoneyMin = minMoney;
   }
   public int deposit(int money) {
	   mine = mine + money;                           //���� �ܰ� + �Ա��ϴ� ��
      System.out.println("�ܰ�: "+ mine);          	  //�ܰ�
      return mine;                                    //���� �ܰ� ����
   }
   public int withdraw(int money) throws InvalidWithdraw{   
	   mine -= money;                           			//�����ܰ� - ����ܰ�
      if(money < 0) {                              			//����� �ܰ� 0���� ������
         throw new InvalidWithdraw("����");         			//�����߻�
      }
      else if(mine < MoneyMin) {                 		    //���� �ܰ�(mine)�� ���� �ܰ�(MoneyMin)���� ������
         throw new InvalidWithdraw("����");       		 	//�����߻�
      }
      else {                                   						 //���� �߻����� ������
         System.out.println("�ܰ� : "+ mine + ", ��� : "+ money);      //�ܰ�� ��ݵ� �� ���
      }
      return mine;
   }
}
public class BankAccount {
   public static void main(String[] args) throws InvalidWithdraw {
   Ex02 ba = new Ex02(-100000);
   ba.withdraw(50000);
   }
}