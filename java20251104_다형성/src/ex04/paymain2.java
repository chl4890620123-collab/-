package ex04;

public class paymain2 {

	public static void main(String[] args) {

		CreditCard cr = new CreditCard();
		cr.fare(10000);
		System.out.println("---------------");
		
		SamsungPay sa = new Samsungpay();
		sa.charge(10000);

	}

}
