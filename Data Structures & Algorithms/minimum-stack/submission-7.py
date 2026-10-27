class MinStack:

    def __init__(self):
        self.stack = []
        self.minS = []
        

    def push(self, val: int) -> None:
        self.stack.append(val)
        if not self.minS:
            self.minS.append(val)
            return

        if val < self.minS[-1]:
            self.minS.append(val)
            return
        else:
            self.minS.append(self.minS[-1])

    def pop(self) -> None:
        self.stack.pop()
        self.minS.pop()
        

    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        return self.minS[-1]
        
