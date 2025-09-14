package level1;

public class Question4 {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see abrupt termination
        handleException();
    }
}