import java.util.Arrays;
import java.util.Collections;

public class IntegerToBinary {
    public static void main(String[] args) {
        Integer[] nums = {3, 1, 2};
        StringBuilder binaryStrings = new StringBuilder();
        
        for (int num : nums) {
            binaryStrings.append(Integer.toBinaryString(num));
        }
        
        String concatenatedBinaryString = binaryStrings.toString();
        int result = Integer.parseInt(concatenatedBinaryString, 2);
        
        System.out.println("Output: " + result);
    }
}
