# StringReverseManual
Write a function that takes a string as input and returns the string in reverse order. The solution should handle edge cases like empty strings and single-character strings.
Explanation:
Logic:
Convert the string to a character array.
Use two pointers (left and right) to swap characters until the middle of the array is reached.
Edge Cases:
Empty strings return themselves.
null strings return themselves to prevent exceptions.
Example:
Input: "hello"
Output: "olleh"
Input: "Java"
Output: "avaJ"