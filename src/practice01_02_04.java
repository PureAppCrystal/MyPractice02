
public class practice01_02_04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] src = str.toCharArray();
		char[] dest = new char[ str.length() ];
		
		int count = 0;
		for (int i=src.length-1; i>=0; i-- ) {
			dest[count] = src[i];
			count++;
		}

		return dest;
	}

	
	
	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		
		for (int i=0; i< array.length; i++ ) {
			System.out.print(array[i]);
		}
		System.out.println("");
	}

}
