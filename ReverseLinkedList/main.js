class List {
  constructor(val = 0, next = null) {
    this.val = val;
    this.next = next;
  }
}

const reverseList = (head) => {
  let curr = head;
  let prev = null;
  while (curr != null) {
    const next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
  }
  return prev;
};

const printList = (head) => {
  process.stdout.write("[ ");
  while (head != null) {
    process.stdout.write(head.val + " ");
    head = head.next;
  }
  console.log("]");
};

const main = () => {
  let list = new List(1, new List(2, new List(3)));
  printList(list);
  list = reverseList(list);
  printList(list);
};

main();
