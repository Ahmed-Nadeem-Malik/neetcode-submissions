class MinStack:

    def __init__(self):
        self.arr = []
        

    def push(self, val: int) -> None:
        self.arr.append(val)

    def pop(self) -> None:
        if self.arr:
            self.arr.pop()
        

    def top(self) -> int:
        if self.arr:
            return self.arr[-1]
        return None

    def getMin(self) -> int:
        min_val = self.arr[0]
        for i in range(1, len(self.arr)):
            if self.arr[i] < min_val:
                min_val = self.arr[i]
        return min_val