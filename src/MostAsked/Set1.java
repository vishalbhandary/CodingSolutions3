package MostAsked;

public class Set1 {
    public String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public void swapNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }

    public boolean isPalindrome(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Set1 set1 = new Set1();
        String original = "Hello, World!";
        String reversed = set1.reverseString(original);
        System.out.println("Java Program to reverse a string w/o using String inbuilt function");
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        System.out.println("Java Program to swap two numbers w/o using the third variable.");
        int a = 2;
        int b = 5;
        set1.swapNumbers(a,b);

        System.out.println("Java Program to find whether a number is prime or not in the most efficient way");
        int[] testNumbers = {1, 2, 18, 19, 20};
        for (int num : testNumbers) {
            System.out.println("Is " + num + " a prime number? " + set1.isPrime(num));
        }

        System.out.println(" Java Program to find whether a string or number is palindrome or not");
        Set1 checker = new Set1();
        String[] testStrings = {"racecar", "hello", "level", "world", "madam"};
        for (String str : testStrings) {
            System.out.println("Is \"" + str + "\" a palindrome? " + checker.isPalindrome(str));
        }

        System.out.println("Java Program for the Fibonacci series in recursion.");
        Set1 calculator = new Set1();
        int n = 10;
        System.out.println("Fibonacci sequence up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(calculator.fibonacci(i) + " ");
        }

    }

}

