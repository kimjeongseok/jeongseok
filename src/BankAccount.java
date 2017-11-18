class InvalidWithdraw extends Exception {
   private static final long serialVersionUID = 1L;
   public InvalidWithdraw(String msg) {
      super(msg);
   }
}
class Ex02{
	int MoneyMin;                           //최소 잔고
	int money;                              //변동하는 잔고
	int mine = 0;                        	//현재 가진 내 잔고
   public Ex02(int minMoney) {              //생성자
      this.MoneyMin = minMoney;
   }
   public int deposit(int money) {
	   mine = mine + money;                           //현재 잔고 + 입금하는 돈
      System.out.println("잔고: "+ mine);          	  //잔고
      return mine;                                    //현재 잔고 리턴
   }
   public int withdraw(int money) throws InvalidWithdraw{   
	   mine -= money;                           			//현재잔고 - 출력잔고
      if(money < 0) {                              			//출력할 잔고가 0보다 작으면
         throw new InvalidWithdraw("오류");         			//오류발생
      }
      else if(mine < MoneyMin) {                 		    //현재 잔고(mine)가 최저 잔고(MoneyMin)보다 작으면
         throw new InvalidWithdraw("오류");       		 	//오류발생
      }
      else {                                   						 //오류 발생하지 않으면
         System.out.println("잔고 : "+ mine + ", 출금 : "+ money);      //잔고랑 출금된 돈 출력
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