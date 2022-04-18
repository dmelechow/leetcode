// https://leetcode.com/problems/rotate-list/

function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val)
    this.next = (next === undefined ? null : next)
}

/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function (head, k) {
    if (!head || !head.next || !k) return head;

    let tail = head;
    let newTail = head;

    let count = 1;

    while (tail.next) {
        tail = tail.next;
        count++;
    }

    tail.next = head;

    for (var i = 1; i < count - (k % count); i++) {
        newTail = newTail.next;
    }

    const newHead = newTail.next;

    newTail.next = null;

    return newHead;
};

const head = [1, 2, 3, 4, 5];
const k = 2;

console.log(rotateRight(head, k));