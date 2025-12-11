# Two Sum — Python solution
# Source: https://leetcode.com/problems/two-sum
# Time complexity: O(n), Space complexity: O(n)

from typing import List, Optional

def two_sum(nums: List[int], target: int) -> Optional[List[int]]:
    seen = {}
    for i, num in enumerate(nums):
        need = target - num
        if need in seen:
            return [seen[need], i]
        seen[num] = i
    return None

if __name__ == "__main__":
    print(two_sum([2,7,11,15], 9))  # [0, 1] (or [1, 0])
