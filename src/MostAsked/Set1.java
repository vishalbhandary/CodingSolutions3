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



    }

}

