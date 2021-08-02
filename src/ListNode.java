package com.bigjayb.linkedlist;

public class ListNode {
    private Object value;
    private ListNode next;
    private ListNode prev;
    
    public ListNode() { }
    
    public ListNode(Object v) {
        this.value = v;
    }
    
    public void setNext(ListNode o) { 
        this.next = o;
    }
    
    public void setPrevious(ListNode o) {
        this.prev = o;
    }
    
    public void setValue(Object o) { 
        this.value = o;
    }
    
    public ListNode next() {
        return this.next;
    }
    
    public ListNode previous() {
        return this.prev;
    }
    
    public Object value() {
        return this.value;
    }
    
}
