package Laboratory4;

import static Laboratory4.Solver.*;


public class Main {
    public static void main (String[] args) {

        Laboratory4.Parenthesis mystack = new Laboratory4.Parenthesis(100);
        String str;

        String[] array = readData("C:\\Users\\Пользователь\\IdeaProjects\\ForStuff\\one_expression.txt");
        String[] array2 = readData( "C:\\Users\\Пользователь\\IdeaProjects\\ForStuff\\three_expressions.txt" );
        printResults( array );
        printResults( array2 );


    }

}
