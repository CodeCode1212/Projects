
import java.util.Random;
import java.util.Scanner;
public class Beginner {
  public static void main(String[] args) {
  Scanner info = new Scanner(System.in); 
  System.out.println("ようこそ占いの館へ");
  System.out.println("あなたの名前を入力してください＞");
   String name = info.nextLine();
  System.out.println("あなたの年齢を入力してください＞");
   int age = info.nextInt();
  String[] fortune = {"大吉", "中吉", "吉", "凶"};
  Random luck = new Random();
   int a = luck.nextInt(3);
  System.out.println("占いの結果が出ました！");
    System.out.printf("%i歳の%sさん、あなたの運命は%sです。", age ,name, fortune[a] );
  
  

   info.close(); 
    }

}
