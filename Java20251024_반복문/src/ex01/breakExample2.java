package ex01;
/*
 * 1~7 이때 총합 10000이상 되는 순간? 값찾기
 */
public class breakExample2 {

	public static void main(String[] args) {
		
			int sum=0;
			int i=0;
			
			while(true) {
				i++;
				sum += i;
				if (sum>=100000) {
					break;
				}
			}
	System.out.println("총합:"+ sum +",i:" +i);
	System.out.println("시스템 종료");
	}

}
