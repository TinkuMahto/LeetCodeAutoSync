class Solution:
    def minimumCost(self, cost1: int, cost2: int, costBoth: int, need1: int, need2: int) -> int:

        minNeed = min(need1, need2)
        maxNeed = max(need1, need2)

        costA = need1 * cost1 + need2 * cost2

        costB = minNeed * costBoth + (maxNeed - need1) * cost2 + (maxNeed - need2) * cost1
        
        costC = maxNeed * costBoth

        return min(costA, costB, costC)


        