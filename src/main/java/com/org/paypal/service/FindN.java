package com.org.paypal.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor(access = AccessLevel.NONE)
public class FindN {
    public static String find(int n) {
        if (n == 1) {
            return "1";
        }
        return get(find(n - 1));
    }

    private static String get(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(count).append(str.charAt(i));
            i++;
        }
        return result.toString();
    }
}
