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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> n=new ArrayList<>();
        while(temp!=null){
        n.add(temp.val);
        temp=temp.next;
        }
         ArrayList<Integer> original = new ArrayList<>(n);

        Collections.reverse(n);
        if(n.equals(original)){
            return true;
        }
        return false;
        
    }
}