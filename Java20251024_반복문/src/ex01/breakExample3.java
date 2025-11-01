package ex01;
/*
 * 
 */
public class breakExample3 {

	public static void main(String[] args) {
		
			int sum=0;
			int i=0;
			
			while(i<10) {
				i++;
				
				if (i%2 ==0)
					continue;
				
				sum += i; //
				}
	System.out.println(sum);
	System.out.println("시스템 종료");
	}

}
