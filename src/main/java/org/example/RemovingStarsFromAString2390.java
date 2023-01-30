package org.example;

import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Solution for https://leetcode.com/problems/removing-stars-from-a-string/
 */
public class RemovingStarsFromAString2390 {

    //first solution - not effective
    public String removeStars(String s) {

        int indexBeforeStar = -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '*' && indexBeforeStar == -1) {
                indexBeforeStar = i - 1;

                if (i + 1 == chars.length) {
                    s = new String(chars).substring(0, indexBeforeStar);
                    chars = s.toCharArray();
                }
            } else if (indexBeforeStar != -1) {
                for (int j = indexBeforeStar; j < chars.length; j++) {
                    if (indexBeforeStar + 2 < chars.length) {
                        chars[j] = chars[indexBeforeStar + 2];
                        indexBeforeStar++;
                    } else {
                        s = new String(chars).substring(0, j);
                        j = chars.length;
                    }
                }
                indexBeforeStar = -1;
                i = -1;
                chars = s.toCharArray();
            }
        }

        return new String(chars);
    }

    //first solution - not effective for leetcode
    public String removeStars2(String s) {

        String s1 = "";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '*') {
                s1 = s1.substring(0, s1.length() - 1);
            } else {
                s1 += s.charAt(i);
            }

        }
        return s1;
    }

    public String removeStars3(String s) {

        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '*') {
                list.removeLast();
            } else {
                list.addLast(s.charAt(i));
            }

        }
        return list.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
