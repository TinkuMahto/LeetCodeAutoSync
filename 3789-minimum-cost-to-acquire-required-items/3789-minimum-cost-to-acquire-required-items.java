class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        long minNeed = Math.min(need1, need2);
        long maxNeed = Math.max(need1, need2);

        //buy everything saperately
        long costA = (long)need1 * cost1 + (long)need2 * cost2;

        //buy type3 for common requirement
        long costB;
        if(need1 < need2){
            costB = minNeed * costBoth + (long)cost2 * (need2 - need1);
        }else{
            costB = minNeed * costBoth + (long)cost1 * (need1 - need2);
        }

        //buy only  type3 items

        long costC = maxNeed * costBoth;

        return Math.min(costA, Math.min(costB, costC));
         



    }
}