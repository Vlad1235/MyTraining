package Java_PatternAPK.Patterns;

/**
 ABCDE
 ABCD
 ABC
 AB
 A
 */

public class Pattern19 {
    public static void main(String[] args) {
        int z = 5;
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (char x = 'A'; x <= 'E'; x++) {
                if (count < z) {
                    System.out.print(x);
                }
                count++;
            }
            System.out.println();
            z--;
        }
    }
}
