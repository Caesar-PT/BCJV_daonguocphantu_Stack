import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int j : list) {
            stack.push(j);
        }
        System.out.println("Trước khi sắp xếp :" + Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            list[i] = stack.pop();
        }
        System.out.println("Sau khi sắp xếp: " + Arrays.toString(list));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự: ");
        String s =scanner.next();

        System.out.println("Trước khi đảo ngược: " + s);
        StringBuilder outp = new StringBuilder();

        Stack<Character> wStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            wStack.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            outp.append(wStack.pop());
        }
        System.out.println("Sau khi đảo ngược chuỗi: " + outp);

    }
}
