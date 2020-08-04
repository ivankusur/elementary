package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int y = post.length - 1;
        for (int i = word.length - 1; i < word.length; i--) {

            if (word[i] != post[y]) {
                result = false;
                break;
            }
            y--;
            if (y < 0) {
                break;
            }
        } return result;
    }
}
