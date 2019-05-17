package manga;
import java.util.Scanner;

public class IntToEng {
    
	// メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(numOfDigits(input));
        System.out.println(translateEng(input));
        System.out.println(getDigit(input,5));
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
	}
     
     //指定の桁の数値を取得するjavaコード
     //https://qiita.com/towamz/items/efe1d60f65bebaa2a422
     static int getDigit(int argNum,int argDig){
    	 int len = String.valueOf(argNum).length();  //対象数値の桁数を求める
         int d = (int)Math.pow(10, len - 1); //べき乗で、対象の数値と同じ桁の10の倍数を求める
         int intCrntDig=0;

         for (int i = 1; i <= len; i++) {
             intCrntDig=argNum / d;

             //指定桁になったらforを抜ける
             if(len-i+1==argDig){
                 break;
             }
             argNum %= d;        //<例>3255/1000=3あまり255で、一番上の桁を落とせる
             d /= 10;            //次の桁チェックのため一桁落とす
         }
         return intCrntDig;
     }
     
     //20
     static void twenty(int input){
    	 if(getDigit(input,2)==2){	 
    	     System.out.println("twenty");
         }
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
    	if(n==11){return "eleven";}
    	if(n==12){return "twelve";}
    	if(n==13){return "thirteen";}
    	if(n==14){return "fourteen";}
    	if(n==15){return "fifteen";}
    	if(n==16){return "sixteen";}
    	if(n==17){return "seventeen";}
    	if(n==18){return "eighteen";}
    	if(n==19){return "nineteen";}
    	if(n==20){return "twenty";}
        return "";
    }

}
