package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> supplement = new ArrayList<>();
        supplement.add("ビタミンC");
        supplement.add("ビタミンA");
        supplement.add("ビタミンB");
        supplement.add("ビタミンE");

        try {

            for (int i = 0; i < supplement.size(); i++) {
                String supple = supplement.get(i + 1);
                System.out.println("今日のサプリは、 " + supple);
            }
        } catch (IndexOutOfBoundsException e) {

            System.out.println("エラー: インデックスが範囲外です");
        }

        System.out.println("サプリメントのリスト: " + supplement);
    }

}
