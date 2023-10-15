package edu.hw1;

public class Problem6 {
    public static boolean isPalindromeDescendant(int number) {
    String str = String.valueOf(number);

    while (str.length() > 1) {
        if (isPalindrome(str)) {
            return true;
        }

        str = goToNextDescendant(str);
    }

    return false;
}

    public static boolean isPalindrome(String str) {
        int right = str.length() - 1;
        int left = 0;


        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static String goToNextDescendant(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i += 2) {
            int sum = Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(i + 1));
            sb.append(sum);
        }

        return sb.toString();
    }
}
