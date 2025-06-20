class NumArray:

    def __init__(self, nums: List[int]):
        self.nums = nums
        self.pSum = [0]

        sSum = 0

        for val in self.nums:
            sSum += val
            self.pSum.append(sSum)
        
        print("prefix xsum array is ",self.pSum)

    def sumRange(self, left: int, right: int) -> int:
        return self.pSum[right+1] - self.pSum[left]


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)class NumArray:

    def __init__(self, nums: List[int]):
        self.nums = nums
        self.pSum = [0]

        sSum = 0

        for val in self.nums:
            sSum += val
            self.pSum.append(sSum)
        
        print("prefix xsum array is ",self.pSum)

    def sumRange(self, left: int, right: int) -> int:
        return self.pSum[right+1] - self.pSum[left]


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)