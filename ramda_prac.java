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
    
    
    
    List<Integer> list = new ArrayList<>();
    
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    
    list.forEach(System.out::println);
    //参照をリストの一つ一つの要素に動かして表示する
  }

}
