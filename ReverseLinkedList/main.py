class List:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseList(head):
    curr = head
    prev = None
    while curr:
        _next = curr.next
        curr.next = prev
        prev = curr
        curr = _next
    return prev

def printList(head):
    print("[", end=' ')
    while head:
        print(head.val, end=' ')
        head = head.next
    print("]")

def main():
    list = List(1, List(2, List(3)))
    printList(list)
    list = reverseList(list)
    printList(list)

if __name__ == "__main__":
    main()