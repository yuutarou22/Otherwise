package practice;

import java.util.finction.BiFunction;

public class Main{
  public static void main(String[] args){
   Function<Integer, Boolean> isOdd = x -> x%2==1; //奇数の判定
   //FunctionはJavaが提唱してる
   BiFunction<Boolean, String, String> honorific = (male, name)->(male ? "Mr.":"Ms.")+name;
   //BiFunction = 二つの引数を受け取って、一つの戻り値
   System.out.println(isOdd.apply(15)); //applyで引数を与える
   System.out.println(honorific.apply(true,"Yutaro"));
   
   
   /**
   //関数に処理プログラムを与えられる。普通は単なる引数のみだよね
   google(x->x%2==0);
   **/
  }

}
