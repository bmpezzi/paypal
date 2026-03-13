package com.org.paypal.service;

import org.springframework.stereotype.Component;

@Component
public class FindN {
    public static String find(String n) {
        String str = "1";
        if ("1".equals(n)) {
            return str;
        }
        for (int i = 1; i < Integer.parseInt(n); i++) {
            str = get(str);
        }
        return str;
    }

    private static String get(String str) {
        int consecutive = 1;
        String result = "";
        for (int i = 0; i < (str.length()-1); i++) {
            char charAtPos = str.charAt(i);
            char charAtNextPos = str.charAt(i+1);
            if (charAtPos == charAtNextPos) {
                consecutive += 1;
            } else if (str.length() == charAtNextPos){
                result += consecutive + String.valueOf(charAtPos);
            } else {
                result += consecutive + String.valueOf(charAtPos);
                consecutive = 0;
            }
        }

        return result;
    }
}
