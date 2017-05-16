package oo2;
import java.util.Scanner;
public class ABCATM {	//创建类ABCATM，模拟农行ATM机
	UnionPay card;
	Scanner sc = new Scanner(System.in);
	public void insertCard(UnionPay card){
		this.card = card;
	}
	private void outCard(){
		card = null;
	}
	private void getBalance (){
		System.out.println("您当前账户余额为："+card.getBalance());
	}
	private void drawMoney(){
		System.out.println("请输入您想要取款当金额：");
		double num = sc.nextDouble();
		if(card.drawMoney(num)){
			System.out.println("取款成功");
		}else{
			System.out.println("取款失败");
		}
	}
	private void payTelBill(){
		if(card instanceof ABCImp){
			ABCImp abcCard = (ABCImp)card;
			System.out.println("请输入您当电话号码和充值金额");
			String str = sc.next();
			double num = sc.nextDouble();
			if(abcCard.payTelBill(str, num)){
				System.out.println("充值成功");
			}else{
				System.out.println("充值失败");
			}
		}else{
			System.out.println("银行卡非农行卡，不能进行缴费");
		}
	}
	public void allMenu(){
		System.out.println("请输入密码：");
		String str = sc.next();
		if(card.checkpwd(str)){
			System.out.println("请选择交易："+"\n"+"1.查询余额   2.取款   3.缴纳电话费");
			int choice =sc.nextInt();
			switch(choice){
			case 1:
				getBalance();
				break;
			case 2:
				drawMoney();
				break;
			case 3:
				payTelBill();
				break;
			default:
				System.out.println("无效输入");
			}
		}else{
			System.out.println("密码错误");
		}
		outCard();
	}
}