public class StringReverseManual {

    // Function to reverse the string manually
    public static String reverseStringManual(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Handle null or empty string
        }

        char[] characters = input.toCharArray();
        int left = 0, right = characters.length - 1;

        while (left < right) {
            // Swap characters
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "hello";
        String input2 = "Java";
        String input3 = ""; // Edge case: empty string
        String input4 = null; // Edge case: null string

        // Reverse strings and print results
        System.out.println("Reversed String (\"hello\"): " + reverseStringManual(input1));
        System.out.println("Reversed String (\"Java\"): " + reverseStringManual(input2));
        System.out.println("Reversed String (\"\"): " + reverseStringManual(input3));
        System.out.println("Reversed String (null): " + reverseStringManual(input4));
    }
}
