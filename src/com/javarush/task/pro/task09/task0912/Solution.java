package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }

    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        if (url.contains(":")) {
            int index = url.indexOf(':');
            if ("http".equals(url.substring(0, index))) {
                return "http";
            } else if ("https".equals(url.substring(0, index))) {
                return "https";
            }
        }

        return "неизвестный";
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        if (url.contains(".")) {
            int index = url.indexOf('.') + 1;
            switch (url.substring(index)) {
                case "com":
                    return "com";
                case "net":
                    return "net";
                case "org":
                    return "org";
                case "ru":
                    return "ru";
            }
        }

        return "неизвестный";
    }
}
