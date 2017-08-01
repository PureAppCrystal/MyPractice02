import java.util.Random;
import java.util.Scanner;

public class practice01_02_05 {

	public static void main(String[] args) {

		// 게임 변수 초기화
		int minNumber = 1;
		int maxNumber = 100;
		int correctNumber = -1;
		
		//게임 시작 관련 변수
		boolean bStartGame = true;
		String  sReGame = null;
		
		//번호찾기 관련 변수
		boolean bTrying = true;
		int tryCount = 0;
		int inputVal = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		//게임 루트 시작
		while (bStartGame) {
			
			//매 게임 초기화
			minNumber = 1;
			maxNumber = 100;
			tryCount = 0;
			bTrying = true;
		
			// 	정답 램덤하게 만들기
			for ( int i=0; i<100; i++) {
				Random random = new Random();
				correctNumber = random.nextInt(maxNumber) + minNumber;
			}
			
			System.out.println("---------------------------");
			System.out.println( correctNumber );
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			
			
			
			//번호 맞추기 시작 
			while ( bTrying ) {
				System.out.println(minNumber+"-"+maxNumber);
			
				tryCount++;
				System.out.print(tryCount+" >> ");
				inputVal = scan.nextInt();
			
				if ( inputVal > correctNumber ) {
					System.out.println("더낮게");
					maxNumber = inputVal-1;
				} else if ( inputVal < correctNumber ) {
					System.out.println("더높게");
					minNumber = inputVal+1;
				} else {
					System.out.println("정답");
					bTrying = false;
				}
			}
			
			
			System.out.print("다시 하시겠습니까?(y/n) >> ");
			sReGame = scan.next();
						
			if (sReGame.equals("n")) {
				bStartGame = false;
			} 
			

		}
		
		scan.close();
	}

}
