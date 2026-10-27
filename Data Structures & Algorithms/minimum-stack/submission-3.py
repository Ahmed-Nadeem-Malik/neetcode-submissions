class MinStack:
    def __init__(self):
        self.stack = []
        self.minStack = []

    def push(self, val: int) -> None:
        if not self.stack:
            self.stack.append(val)
            self.minStack.append(val)
            return

        self.stack.append(val)
        self.minStack.append(min(self.minStack[-1], val))
        

    def pop(self) -> None:
        if not self.stack:
            return None
        self.stack.pop()
        self.minStack.pop()


    def top(self) -> int:
        if not self.stack:
            return None
        return self.stack[-1]

    def getMin(self) -> int:
        if not self.stack:
            return None
        return self.minStack[-1]
