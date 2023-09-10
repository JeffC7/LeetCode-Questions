class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        def nestedBinarySearch(matrix_list):
            left, right = 0, len(matrix_list)
            while (left <= right):
                mid = (left + right) / 2
                if (matrix_list[mid] == target):
                    return True
                elif (matrix_list[mid] < target):
                    left = mid + 1
                else: 
                    right = mid - 1
        
        o_left = 0
        o_right = len(matrix)
        while(o_left < o_right):
            o_mid = (o_left + o_right) / 2
            if (matrix[o_mid][0] <= target <= matrix[o_mid][len(matrix[o_mid]) - 1]):
                return nestedBinarySearch(matrix[o_mid])
            elif (target < matrix[o_mid][0]):
                o_right = o_mid
            elif (target > matrix[o_mid][-1]):
                o_left = o_mid + 1
        return False
        