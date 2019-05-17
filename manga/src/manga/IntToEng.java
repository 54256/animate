package manga;
import java.util.Scanner;

public class IntToEng {
    
	// メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int len = String.valueOf(input).length();
        if(len==6){
            sanketame(input,6);
          }
        if(len>=5){
          goketame(input);
        }
        if(len==4){
        	yonketame(input);
       }
        if(len>=3){
        sanketame(input,3);
        }
        if(len>=2){
        hutaketame(input,2);//2桁目　ex. twenty, thirty, ...
         if(getDigit(input,2)==1){
    	  System.out.print(translateEngtwo(getDigit(input,1)));
            }else{
          System.out.print(translateEng(getDigit(input,1)));//１桁目　
         }
        }
        if(len==1){
        if(input==0){System.out.print("zero");}//0の時だけ別処理
           System.out.print(translateEng(getDigit(input,1)));//１桁目　
        }
        
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
     
     //2桁目
     static void hutaketame(int input, int kurai){
    	 if(getDigit(input,kurai)==2){	 
    	     System.out.print("twenty ");
         }
    	 if(getDigit(input,kurai)==3){	 
    	     System.out.print("thirty ");
         }
    	 if(getDigit(input,kurai)==4){	 
    	     System.out.print("forty ");
         }
    	 if(getDigit(input,kurai)==5){	 
    	     System.out.print("fifty ");
         }
    	 if(getDigit(input,kurai)==6){	 
    	     System.out.print("sixty ");
         }
    	 if(getDigit(input,kurai)==7){	 
    	     System.out.print("seventy ");
         }
    	 if(getDigit(input,kurai)==8){	 
    	     System.out.print("eighty ");
         }
    	 if(getDigit(input,kurai)==9){	 
    	     System.out.print("ninety ");
         }
    	 
     }
     
     //３桁目
     static void sanketame(int input,int kurai){
    	 if(getDigit(input,kurai)!=0){
    	     System.out.print(translateEng(getDigit(input,kurai))+" hundred ");
    	 }
     }
     
     //４桁目
     static void yonketame(int input){
    	     System.out.print(translateEng(getDigit(input,4))+" thousand, ");
     }
     
     //5桁目
     static void goketame(int input){
    		 hutaketame(input,5);
    	        if(getDigit(input,5)==1){
    	        	System.out.print(translateEngtwo(getDigit(input,4)));
    	        }else{      	
    	            System.out.print(translateEng(getDigit(input,4)));//１桁目　
    	        }
    	 System.out.print(" thousand, ");
     }
     
    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(n==1){return "one";}
    	if(n==2){return "two";}
    	if(n==3){return "three";}
    	if(n==4){return "four";}
    	if(n==5){return "five";}
    	if(n==6){return "six";}
    	if(n==7){return "seven";}
    	if(n==8){return "eight";}
    	if(n==9){return "nine";}
    	return "";
    }
    static String translateEngtwo(int n) {
    	if(n==0){return "ten";}
    	if(n==1){return "eleven";}
    	if(n==2){return "twelve";}
    	if(n==3){return "thirteen";}
    	if(n==4){return "fourteen";}
    	if(n==5){return "fifteen";}
    	if(n==6){return "sixteen";}
    	if(n==7){return "seventeen";}
    	if(n==8){return "eighteen";}
    	if(n==9){return "nineteen";}
        return "";
    }

}
