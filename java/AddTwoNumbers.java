/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //ListNode head1 = reverseLinkedList(l1);
        //ListNode head2 = reverseLinkedList(l2);
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode sumHead = null;
        ListNode headNode = new ListNode();
        int value1 = 0;
        int value2 = 0;
        int sum = 0;
        int carry = 0;
        int units = 0;
        while( head1 != null || head2 !=null)
        {
            if(head1 != null){
                value1 = head1.val;
                head1 = head1.next;
            }
            else{
                value1 = 0;    
            }
            if(head2 != null){
                value2 = head2.val;
                head2 = head2.next;
            }
            else{
                value2 = 0;
            }
        
            sum = value1+value2+carry;
            if(sum > 9)
            {
                units = sum - 10; 
            }else{
                units = sum;
            }
            
            carry = 0;
            
            if(sum > 9){
                carry = 1;
            }
            
            ListNode node = new ListNode(units);
            if(sumHead == null)
            {
                sumHead = node;
                headNode = node;
            }
            else{
                sumHead.next = node;
                sumHead = sumHead.next;

            }
                    
        }
        if(carry == 1)
        {
            ListNode node = new ListNode(carry);
            sumHead.next = node;
            sumHead = sumHead.next;
        }
        
        return headNode;
    
    }
    
    public ListNode reverseLinkedList(ListNode head)
    {
        ListNode prevNode = null;
        ListNode currentNode = head;
        while(currentNode != null)
        {
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        
        return prevNode;
        
    }
    
}