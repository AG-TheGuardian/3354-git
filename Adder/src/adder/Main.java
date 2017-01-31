package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Number format incorrect. Please try again.");
        } catch (NullPointerException e) {
            System.err.println("Please provide arguments.");
        } catch (Exception e) {
            System.err.println("Unknown exception. Please try again.");
        }
    }

    private static int addArguments(String[] args) {
        int val = 0;
        for(String a: args)
            val += Integer.valueOf(a);
        return val;
    }
}
