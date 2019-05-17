package manga;
import java.util.Scanner;

public class IntToEng {
    
	// メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(numOfDigits(sc));
        System.out.println(translateEng(input));
    }
    //桁数を判断するメソッド
     static int numOfDigits( int num){
		// 桁数
		int digits = 0;
		while(num > 0) {
			num /= 10;
			digits++;
		}
		return digits;
		//System.out.println(digits);
	}
    
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(n==0){return "zero";}
    	if(n==1){return "one";}
    	if(n==2){return "two";}
    	if(n==3){return "three";}
    	if(n==4){return "four";}
    	if(n==5){return "five";}
    	if(n==6){return "six";}
    	if(n==7){return "seven";}
    	if(n==8){return "eight";}
    	if(n==9){return "nine";}
    	if(n==10){return "ten";}
        return "";
    }

}
