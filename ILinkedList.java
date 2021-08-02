package com.bigjayb.linkedlist;

public interface ILinkedList {
	int size();
	boolean isEmpty();
	ListNode first();
	ListNode last();
	ListNode before(ListNode p);
	ListNode after(ListNode p);
	Object replaceElement(ListNode n, Object o);
	ListNode insertBefore(ListNode n, Object o);
	ListNode insertAfter(ListNode n, Object o);
	ListNode insertFirst(Object o);
	ListNode insertLast(Object o);
	Object remove(ListNode n);
}
