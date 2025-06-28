class Node:
    def __init__(self, value):
        self._value = value
        self._left = None
        self._right = None

    def add(self, val):
        if val > self._value:
            if self._right is None:
                self._right = Node(val)
            else:
                self._right.add(val)
        else:
            if self._left is None:
                self._left = Node(val)
            else:
                self._left.add(val)

    def print_in_order(self):
        if self._left:
            self._left.print_in_order()
        print(self._value)
        if self._right:
            self._right.print_in_order()


class BinaryTree:
    def __init__(self):
        self.root = None

    def add(self, val):
        if self.root is None:
            self.root = Node(val)
        else:
            self.root.add(val)

    def print_tree(self):
        if self.root:
            self.root.print_in_order()
