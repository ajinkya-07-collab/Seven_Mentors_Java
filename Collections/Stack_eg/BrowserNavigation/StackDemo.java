package Collections.Stack_eg.BrowserNavigation;

import java.util.*;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stk = new Stack<>();

        stk.push("RecusrionFunctionCall - 1");
        stk.push("RecusrionFunctionCall - 2");
        stk.push("RecusrionFunctionCall - 3");
        stk.push("RecusrionFunctionCall - 4");
        stk.push("RecusrionFunctionCall - 5");

        System.out.println(stk);

        System.out.println("Top Function on Stack : ");
        System.out.println(stk.peek());

        // System.out.println(stk.pop());

        System.out.println(stk.empty());

    }

}
