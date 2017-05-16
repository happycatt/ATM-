package oo2;

public class ABCImp implements ABC{		//创建类ABCImp实现接口ABC
	private double money;
	private String pwd;
	public ABCImp (double money,String pwd){	//创建ABCImp的有参构造方法为其赋值；
		this.money =money;
		this.pwd = pwd;
	}
	public double getBalance(){		//重写getBalance方法
		return money;
	}
	public boolean drawMoney(double number){	//重写drawMoney方法，当欠款小于2000元时均可实现取款功能
		if(money-number>=-2000){
			money-=number;
			return true;
		}else{
			return false;
		}
	}
	public boolean checkpwd(String input){	//重写checkpwd方法
		if(input.equals(pwd)){
			return true;
		}else{
			return false;
		}
	}
	public boolean payTelBill(String phoneNum,double money){	//重写payTelBill方法
		if(phoneNum.length()==11&&this.money-money>=-2000){
			this.money-=money;
			return true;
		}else{
			return false;
		}
	}

}
