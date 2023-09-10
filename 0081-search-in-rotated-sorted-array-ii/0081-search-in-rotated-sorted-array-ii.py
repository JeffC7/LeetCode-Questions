class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = (left + right) / 2
            if nums[mid] == target:
                return True
            elif nums[mid] == nums[left] and nums[mid] == nums[right]:
                left = left + 1
                right = right - 1
            elif nums[left] <= nums[mid]:
                if nums[mid] >= target and nums[left] <= target:
                    right = mid - 1
                else: 
                    left = mid + 1
            else:
                if target >= nums[mid] and target <= nums[right]:
                    left = mid + 1
                else: 
                    right = mid - 1
        return False
        