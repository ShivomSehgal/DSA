 public static LinkedList findLoop(LinkedList head) {
    LinkedList newHead=null;
		LinkedList current=head;
		Map<Integer,LinkedList> map=new HashMap<Integer,LinkedList>();
		while(!map.containsKey(current.value) && current!=null){
			map.put(current.value,current);
			current=current.next;
		}
		LinkedList temp=head;
		while(temp.next != current){
			temp=temp.next;
		}
		temp.next=null;
		
    return current;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
