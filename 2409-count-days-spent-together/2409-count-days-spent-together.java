class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int arriveAliceDay = convertToDays(arriveAlice, month);
        int leaveAliceDay = convertToDays(leaveAlice, month);
        int arriveBobDay = convertToDays(arriveBob, month);
        int leaveBobDay = convertToDays(leaveBob, month);

        int start = Math.max(arriveAliceDay, arriveBobDay);
        int end = Math.min(leaveAliceDay, leaveBobDay);

        return Math.max(0, end - start + 1);
    }

    private int convertToDays(String date, int[] month) {
        int m = Integer.parseInt(date.substring(0, 2));
        int d = Integer.parseInt(date.substring(3, 5));

        for (int i = 1; i < m; i++) {
            d += month[i];
        }

        return d;
    }

}
