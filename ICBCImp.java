package oo2;

public class ICBCImp implements ICBC{		//创建类ICBCImp用于实现接口ICBC
	private double money;
	private String pwd;
	ICBCImp(double money,String pwd){		//创建ICBCImp有参构造方法为其赋值；
		this.money = money;
		this.pwd = pwd;
	}
	public double getBalance(){		//重写getBalance方法。
		return money;
	}
	public boolean drawMoney(double number){	//重写drawMoney方法。
		if(number<=money){
			money-=number;
			return true;
		}else{
			return false;
		}
	}
	public boolean checkpwd(String input){		//重写checkpwd方法。
		if(input.equals(pwd)){
			return true;
		}else{
			return false;
		}
	}
	public boolean payOnline(double num){	//重写payOnline方法
		if(num<=money){
			money-=num;
			return true;
		}else{
			return false;
		}
	}

}
