package Laboratory4;

import java.util.Arrays;

public class Parenthesis {
    static char[] stack;    // stack for parantheses
    static int top=0;       // indice = where is in array now
    Parenthesis(int size)
    {
        stack= new char[size];   // creating an array of chars
    }

    private static void push(char a)
    {
        stack[++top] = a;
    }
    private static int  pop()
    {
        if (top == -1)   // )( ,   (())()
        {
            return 0;
        }
        else
        {
            stack[top--]=0;     // char null has value 0 so we clear the slot and then top value decrease by 1
        }
        return 1; // for when we don't find special cases
    }
    private static boolean getConclusion()   //
    {
        if (top == -1)     //  -1 shows that it is empty
            return true;
        else
            return false;
    }
    public static boolean isValid(String str)
    {
        top=-1; // stack starts as empty
        int i;
        for (i = 0;i < str.length ();i++)
        {
            if (str.charAt (i) == '(')   // when finds an '(' adds it in the stack
            {
                push(str.charAt (i));   // push in the stack
            }
            else if (str.charAt (i) == ')')
            {
                if (pop()==0)
                {
                    return false;
                }

            }
        }
        return getConclusion();
    }
}