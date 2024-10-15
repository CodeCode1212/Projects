
import java.util.Random;
import java.util.Scanner;
public class Beginner {
  public static void main(String[] args) {
  System.out.println("ようこそ占いの館へ");
  System.out.println("あなたの名前を入力してください＞");
  Scanner info = new Scanner(System.in);
  String name = info.nextLine();
  System.out.println("あなたの年齢を入力してください＞");
  int age = info.nextInt();
  String[] fortune = {"大吉", "中吉", "吉", "凶"};
  Random luck = new Random();
  int a = luck.nextInt(3);
  System.out.print("占いの結果が出ました！ \n" + age + "の" + name + "さん、あなたの運命は" + fortune[a] + "です。" );
  
  

   info.close(); // your code
    }

}
