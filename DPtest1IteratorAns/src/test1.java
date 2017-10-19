import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        //普通のfor文でListに要素を詰め込んでみる
        List testList = new ArrayList();
        for (int i=0; i<10; i++) {
            testList.add(i);
        }

        //イテレータを使ってみる
        System.out.println("\nイテレータの例：");
        //配列に入れた数値を順に表示するコードを記述
        for (Iterator iterator = testList.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next().toString() + ",");
        }
    }
}