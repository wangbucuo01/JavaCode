package com.wangbucuo.first;
import java.util.Scanner;

public class KeyBoard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score == 100) {
            System.out.println("满分！");
        } else if(score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("良好");
        } else {
            System.out.println("不及格");
        }
    }
}
