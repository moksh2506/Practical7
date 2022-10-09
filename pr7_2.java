package com.company;

public class pr7_2 {
    static int count(String str, String word) {
        String a[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i]))
                count++;
        }
        return count;
    }
    public static void main(String args[]) {
        String str = "I am studing at Charusat University..";
        String word = "University..";
        System.out.println(count(str, word));
        System.out.println("This program is prepared by 21CE099_Moksh:)");
    }
}
