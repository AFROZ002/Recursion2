package Permutation_And_Combination;

import java.util.ArrayList;

public class Genrate_All_Balance_Paranthesis {
    public  static  void  paranthesis(int open, int close, String p, ArrayList<String> Al) {
        if (open == 0 && close == 0) {
            StringBuilder temp = new StringBuilder(p);
            Al.add(temp.toString());
            return;
        }
        if (open != 0) {
            String op1 = p;
            op1 += '(';
            paranthesis(open - 1, close, op1, Al);
        }
        if (close > open) {
            String op2 = p;
            op2 += ')';
            paranthesis(open, close - 1, op2, Al);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int open = n;
        int close = n;
        String p = "";
        ArrayList<String> Al = new ArrayList<>();
        paranthesis(open, close, p, Al);

        // Printing the generated balanced parentheses
        for (String parentheses : Al) {
            System.out.println(parentheses);
        }
    }
}
