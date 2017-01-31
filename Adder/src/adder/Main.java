package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int val = 0;
        int i;
        boolean subtract = false;
        boolean skip = true;
        
        if(args[0].contentEquals("-"))
            subtract = true;
        
        for(String a: args) {
            if(subtract) {
                if(!skip) {
                    i = Integer.valueOf(a);
                    if(i > 0)
                        val -= i;
                    else val += i; 
                }
                else skip = false;
            }
            else val += Integer.valueOf(a);
        }
            return val;
    }
}
