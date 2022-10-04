#include <iostream>

struct List {
    int val;
    List* next;

    List(int v = 0, List* n = nullptr) : val(v), next(n)
    {}
};

List* reverseList(List* head) {
    List* curr = head;
    List* prev = nullptr;
    while (curr != nullptr) {
        List* next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

void printList(List* head) {
    std::cout << "[ ";
    while (head != nullptr) {
        std::cout << head->val << " ";
        head = head->next;
    }
    std::cout << "]" << std::endl;
}

int main() {
    List* list = new List(1, new List(2, new List(3)));
    printList(list);
    list = reverseList(list);
    printList(list);
}