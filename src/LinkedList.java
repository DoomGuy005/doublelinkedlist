package com.bigjayb.linkedlist;

public class LinkedList implements ILinkedList {
    
    private ListNode start = new ListNode();
    private ListNode end = new ListNode();
    private int size;
    
    public LinkedList() {
        this.start.setNext(end);
        this.end.setPrevious(start);
        this.size = 0;
    }
    
    public void display() {
        ListNode nodeToDipslay;
        if (this.isEmpty()) {
            System.out.println("{ Nada para imprimir. }");
        } else {
            nodeToDipslay = this.start.next();
            System.out.print("{");
            while (nodeToDipslay.next() != null) {
                System.out.print(" ");
                System.out.print(nodeToDipslay.value());
                System.out.print(" ");
                nodeToDipslay = nodeToDipslay.next();
        }
        System.out.println("}");
        }
    }

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		if (this.start.next() == this.end) return true;
		return false;
	}

	@Override
	public ListNode first() {
		return this.start.next();
	}

	@Override
	public ListNode last() {
		return this.end.previous();
	}

	@Override
	public ListNode before(ListNode p) {
		return p.previous();
	}

	@Override
	public ListNode after(ListNode p) {
		return p.next();
	}

	@Override
	public Object replaceElement(ListNode n, Object o) {
		Object replacedNode = n.value();
		n.setValue(o);
		return replacedNode;
	}

	@Override
	public ListNode insertBefore(ListNode n, Object o) {
		ListNode newNode = new ListNode(o);
		newNode.setNext(n);
		newNode.setPrevious(n.previous());
		n.previous().setNext(newNode);
		n.setPrevious(newNode);
		this.size++;
		return newNode;
	}

	@Override
	public ListNode insertAfter(ListNode n, Object o) {
		ListNode newNode = new ListNode(o);
		newNode.setPrevious(n);
		newNode.setNext(n.next());
		n.next().setPrevious(newNode);
		n.setNext(newNode);
		this.size++;
		return newNode;
	}

	@Override
	public ListNode insertFirst(Object o) {
		return this.insertAfter(this.start, o);
	}
	
	@Override
    public ListNode insertLast(Object o) {
		return this.insertBefore(this.end, o);
    }

	@Override
	public Object remove(ListNode n) {
		Object removedNode = n.value();
		n.previous().setNext(n.next());
		n.next().setPrevious(n.previous());
		this.size--;
        return removedNode;
	}
}
