class InvalidWithdraw2 extends Exception {
   private static final long serialVersionUID = 1L;
   public InvalidWithdraw2(String msg) {
      super(msg);
   }
}
class Ex03{
	int MoneyMin;                           //�ּ� �ܰ�
	int money;                              //�����ϴ� �ܰ�
	int mine = 0;                        	//���� ���� �� �ܰ�
   public Ex03(int minMoney) {              //������
      this.MoneyMin = minMoney;
   }
   public int deposit2(int money) {                        
	   mine = mine + money;                           //���� �ܰ� + �Ա��ϴ� ��
      System.out.println("���� �Ա�ó��: �Աݱݾ�="+ money + ", �ܱ�=" + mine);   //�ܰ�
      return mine;                                          //���� �ܰ� ����
   }
   public int withdraw2(int money) throws InvalidWithdraw2{         
	   mine -= money;                                     	   //�����ܰ� - ����ܰ�
      if(money < 0) {                                          //����� �ܰ� 0���� ������
         throw new InvalidWithdraw2("�ʰ���� �䱸 ����.");      //���� InvalidWithdraw2 Ŭ������ ���� �����߻�
      }
      else if(mine < MoneyMin) {                               //���� �ܰ�(mine)�� ���� �ܰ�(MoneyMin)���� ������
         throw new InvalidWithdraw2("�ʰ���� �䱸 ����.");      //���� InvalidWithdraw2 Ŭ������ ���� �����߻�
      }
      else {                                                   //���� �߻����� ������
         System.out.println("���� ���ó��: ����ݾ�="+ money + ", �ܱ�=" + mine); //�ܰ�� ��ݵ� �� ���
      }
      return mine;
   }
}
public class BankAccount2 {
   public static void main(String[] args) throws InvalidWithdraw2 {
   Ex03 ba = new Ex03(-100000);
   ba.deposit2(100000);
   ba.withdraw2(100000);
   ba.withdraw2(200000);
   }
}
