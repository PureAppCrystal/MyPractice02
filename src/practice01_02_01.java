import java.util.Scanner;

public class practice01_02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("금액 : ");
		Scanner scan = new Scanner(System.in);
		int inputValue = scan.nextInt();
				
		int[] won = {0,0,0,0,0,0,0,0,0,0};
		int[] div = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		for (int i=0; i<won.length; i++) {
			
			won[i] = inputValue / div[i];
			inputValue = inputValue - ( won[i] * div[i] );
			
			System.out.println(div[i]+"원 : "+won[i]+"개");
		}
		scan.close();
	}
}
