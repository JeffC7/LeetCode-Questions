class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        task_arr = [0] * 26
        for task in tasks:
            task_arr[ord(task) - ord('A')] += 1
        
        task_arr.sort()
        max_val = task_arr[25] - 1
        idle_slots = max_val * n

        for i in range(0, 25):
            idle_slots -= min(max_val, task_arr[i])
        
        return len(tasks) + idle_slots if idle_slots >= 0 else len(tasks)

        
        