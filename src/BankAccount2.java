class InvalidWithdraw2 extends Exception {
   private static final long serialVersionUID = 1L;
   public InvalidWithdraw2(String msg) {
      super(msg);
   }
}
class Ex03{
	int MoneyMin;                           //최소 잔고
	int money;                              //변동하는 잔고
	int mine = 0;                        	//현재 가진 내 잔고
   public Ex03(int minMoney) {              //생성자
      this.MoneyMin = minMoney;
   }
   public int deposit2(int money) {                        
	   mine = mine + money;                           //현재 잔고 + 입금하는 돈
      System.out.println("정상 입금처리: 입금금액="+ money + ", 잔금=" + mine);   //잔고
      return mine;                                          //현재 잔고 리턴
   }
   public int withdraw2(int money) throws InvalidWithdraw2{         
	   mine -= money;                                     	   //현재잔고 - 출력잔고
      if(money < 0) {                                          //출력할 잔고가 0보다 작으면
         throw new InvalidWithdraw2("초과출금 요구 예외.");      //위의 InvalidWithdraw2 클래스로 가서 오류발생
      }
      else if(mine < MoneyMin) {                               //현재 잔고(mine)가 최저 잔고(MoneyMin)보다 작으면
         throw new InvalidWithdraw2("초과출금 요구 예외.");      //위의 InvalidWithdraw2 클래스로 가서 오류발생
      }
      else {                                                   //오류 발생하지 않으면
         System.out.println("정상 출금처리: 인출금액="+ money + ", 잔금=" + mine); //잔고랑 출금된 돈 출력
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
