class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:

        minSum = float('inf')
        n = len(nums)
        while l <= r :

            size = l
            
            for i in range(n - size + 1):
                currSum = sum(nums[i : i + size])

                if currSum > 0:
                    minSum = min(minSum, currSum)
            
            l += 1
        return minSum if minSum != float('inf') else -1
        