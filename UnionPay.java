package oo2;

interface UnionPay {		//创建UnionPay接口，包含getBalance,drawMoney,checkpwd三个银联卡基本功能
	double getBalance();		
	boolean drawMoney(double number);
	boolean checkpwd(String input);
}

interface ICBC extends UnionPay{		//创建ICBC接口，包含工行卡专属网上支付功能；
	boolean payOnline(double num);
}

interface ABC extends UnionPay{		//创建农行卡ABC接口，包含农行专属交话费功能；
	boolean payTelBill(String phoneNum,double money);
}