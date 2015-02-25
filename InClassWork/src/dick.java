import java.util.Scanner;


public class dick {
	public static void main(String[] args) {
	
	int input = 0;
	
	int even = 0;
	
	int odd = 0;
	
	Scanner scan = new Scanner(System.in);
	input = scan.nextInt();
			
		while (input > 0){
			if (((input % 10) % 2) == 0){
			even ++;}
			
			else{
				odd ++;
			}
			input = (int)(input / 10);
			}
			
		System.out.println(odd + " odd numbers");
		System.out.println(even + " even numbers");
	} 
}
