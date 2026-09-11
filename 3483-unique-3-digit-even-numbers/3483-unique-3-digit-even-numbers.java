class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        // Count frequency of each digit
        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;

        // Check every 3-digit number
        for (int num = 100; num <= 999; num++) {

            // Number must be even
            if (num % 2 != 0) {
                continue;
            }

            int ones = num % 10;
            int tens = (num / 10) % 10;
            int hundreds = num / 100;

            // Check if required digits are available
            int[] needed = new int[10];

            needed[ones]++;
            needed[tens]++;
            needed[hundreds]++;

            boolean possible = true;

            for (int i = 0; i < 10; i++) {
                if (needed[i] > freq[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                count++;
            }
        }

        return count;
    }
}