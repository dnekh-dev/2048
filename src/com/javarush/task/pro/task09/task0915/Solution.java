package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        if (query == null || query.isEmpty()) {
            return new String[0];
        }

        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        int countOfTokens = tokenizer.countTokens();
        String[] tokens = new String[countOfTokens];

        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            tokens[i] = tokenizer.nextToken();
            i++;
        }

        return tokens;
    }
}
