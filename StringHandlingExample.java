public class StringHandlingExample {

    public static void main(String[] args) {
        // 1. String Declaration
        String str1 = "Hello";            // String literal
        String str2 = new String("Hello"); // Using 'new' keyword

        // 2. Common String Methods

        // Length of a string
        int length = str1.length();
        System.out.println("Length of str1: " + length); // Output: 5

        // Concatenation
        String fullName = "John".concat(" Doe");
        System.out.println("Full Name: " + fullName); // Output: John Doe
        String fullName2 = "John" + " Doe";
        System.out.println("Full Name using +: " + fullName2); // Output: John Doe

        // Character access
        char firstChar = str1.charAt(0);
        System.out.println("First character of str1: " + firstChar); // Output: H

        // Substring
        String substr = str1.substring(0, 4);
        System.out.println("Substring of str1: " + substr); // Output: Hell

        // Replace characters
        String replaced = str1.replace("H", "J");
        System.out.println("Replaced str1: " + replaced); // Output: Jello

        // Equality check
        boolean isEqual = str1.equals(str2);
        System.out.println("Is str1 equal to str2: " + isEqual); // Output: true

        // Case-insensitive equality check
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello");
        System.out.println("Is str1 equal to 'hello' ignoring case: " + isEqualIgnoreCase); // Output: true

        // String comparison
        int comparisonResult = str1.compareTo(str2);
        System.out.println("String comparison result: " + comparisonResult); // Output: 0

        // Trim whitespace
        String strWithWhitespace = "   Hello   ";
        String trimmed = strWithWhitespace.trim();
        System.out.println("Trimmed string: '" + trimmed + "'"); // Output: 'Hello'

        // Split string
        String sentence = "This is a test";
        String[] words = sentence.split(" ");
        System.out.println("Split words: ");
        for (String word : words) {
            System.out.println(word);
        }

        // Convert to upper case and lower case
        String upperCaseStr = str1.toUpperCase();
        String lowerCaseStr = str1.toLowerCase();
        System.out.println("Uppercase: " + upperCaseStr); // Output: HELLO
        System.out.println("Lowercase: " + lowerCaseStr); // Output: hello

        // Contains substring
        boolean containsSubstring = str1.contains("Hel");
        System.out.println("Does str1 contain 'Hel': " + containsSubstring); // Output: true

        // Check prefix and suffix
        boolean startsWithH = str1.startsWith("H");
        boolean endsWithO = str1.endsWith("o");
        System.out.println("Does str1 start with 'H': " + startsWithH); // Output: true
        System.out.println("Does str1 end with 'o': " + endsWithO); // Output: true

        // 3. StringBuilder and StringBuffer
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder content: " + sb.toString()); // Output: Hello World

        // 4. String Formatting
        String formattedStr = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("Formatted string: " + formattedStr); // Output: Name: John, Age: 25

        // 5. Converting Between Strings and Other Types

        // Convert int to string
        int num = 10;
        String numStr = String.valueOf(num);
        System.out.println("Integer as string: " + numStr); // Output: 10

        // Convert string to int
        String numStr2 = "20";
        int num2 = Integer.parseInt(numStr2);
        System.out.println("String to integer: " + num2); // Output: 20

        // 6. Immutability in Practice
        String immutableStr = "Hello";
        immutableStr.concat(" World"); // This will not change the original string
        String newStr = immutableStr.concat(" World");
        System.out.println("Immutable example - newStr: " + newStr); // Output: Hello World
        System.out.println("Original immutableStr: " + immutableStr); // Output: Hello

        // 7. String Interning
        String internedStr = new String("Hello").intern();
        System.out.println("Interned string: " + internedStr); // Output: Hello

    }
}
