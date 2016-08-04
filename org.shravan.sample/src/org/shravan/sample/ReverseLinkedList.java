package org.shravan.sample;



/**
 * @author Shravan
 * recursive => generate code for 2 elements and then
 * generalize it by calling the method for 2 element (for example
 * below code is generated for 1 and 2 elements and i
 * t is generalized by passing 2nd element)
 */
public class ReverseLinkedList {
	
	public static ListNode reverse = new ListNode();
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.setNext(l2);
		l2.setNext(l3);
		l3.setNext(l4);
		
		
		ReverseLinkedList rll = new ReverseLinkedList();
		
		reverse = rll.reverseList(l1);
		
		while(reverse!=null){
				 System.out.println(reverse.getData());
				 reverse = reverse.getNext();
		}
		
		//System.out.println(reverse.getData() + " " + reverse.getNext().getData());
		
	}
	
	public ListNode reverseList( ListNode present){
		
				if(present==null)
					return null;
				else if(present.getNext()==null)
					return present;
				
				ListNode next = present.getNext();
				present.setNext(null);
				
				reverse = reverseList(next);
				next.setNext(present);
				
				return reverse;
	}
}
