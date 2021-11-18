import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        //String text="[]()";


        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
                Bracket b=new Bracket(next, position);
                opening_brackets_stack.push(b);
                continue;
            }

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
                Bracket popchr=opening_brackets_stack.pop();
                if(!popchr.Match(next)){
                    System.out.print("Not Match Brakets!!");
                    return;
                }

            }
        }
            System.out.print("Match Brakets!!");
        // Printing answer, write your code here
    }
}
