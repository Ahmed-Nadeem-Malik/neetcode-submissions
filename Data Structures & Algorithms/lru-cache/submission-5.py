class Node:
    __slots__ = ("key", "val", "left", "right")
    def __init__(self, key=0, val=0):
        self.key = key
        self.val = val
        self.left = None
        self.right = None

class LRUCache:
    def __init__(self, capacity: int):
        self.capacity = capacity
        self.map = {}
        # sentinels: head <-> ... <-> tail
        self.head = Node()  # LRU side
        self.tail = Node()  # MRU side
        self.head.right = self.tail
        self.tail.left = self.head

    def _remove(self, node: Node) -> None:
        L, R = node.left, node.right
        L.right = R
        R.left = L

    def _insert_mru(self, node: Node) -> None:
        # insert just before tail
        L = self.tail.left
        node.left = L
        node.right = self.tail
        L.right = node
        self.tail.left = node

    def get(self, key: int) -> int:
        node = self.map.get(key)
        if not node:
            return -1
        self._remove(node)
        self._insert_mru(node)
        return node.val

    def put(self, key: int, value: int) -> None:
        if self.capacity == 0:
            return
        if key in self.map:
            node = self.map[key]
            node.val = value
            self._remove(node)
            self._insert_mru(node)
            return
        if len(self.map) == self.capacity:
            lru = self.head.right
            self._remove(lru)
            del self.map[lru.key]
        node = Node(key, value)
        self.map[key] = node
        self._insert_mru(node)