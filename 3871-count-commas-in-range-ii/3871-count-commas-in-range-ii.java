class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {
            long count = n - start + 1;

            if (count > start * 1000 - start) {
                count = start * 1000 - start;
            }

            ans += count * commas;

            start *= 1000;
            commas++;
        }

        return ans;
    }
}