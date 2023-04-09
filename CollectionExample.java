import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;

public class CollectionExample{
    public static void main(String[] args) {
        //java.lang.Iterable<E>
        //collection<--- List  (interface)  <--- ArrayList(class), Vector(class), LinkedList (class)
        //          <--- Queue (interface)  <--- Deque, PriorityQueue (class)  {Deque (interface) <--- LinkedList,ArrayDeque}
        //          <--- Set   (interface)  <--- HashSet (class), LinkedHashSet(class) {Set(interface) <--- SortedSet(interface) <--- HashSet(class))}
        //                                       SortedSet (interface) <--- Navigable (interface) <--- TreeSet (class)

        //ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(2);
        list.add(40);
        list.add(10);
        list.add(3);
        System.out.println("List - "+list);
        System.out.println("------------------------------------------");

        //LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(10);
        linkedList.add(3);
        System.out.println("LinkedList - "+linkedList);
        ListIterator<Integer> iterate = linkedList.listIterator();
        System.out.println(iterate.next());     //return 1 moved to 2
        System.out.println(iterate.next());     //return 2 moved to 4
        System.out.println(iterate.next());     //return 4 moved to 10
        System.out.println(iterate.previous()); //moved to 4 return 4
        System.out.println(iterate.previous()); //moved to 2 return 2
        System.out.println(iterate.next());     //return 2 moved to 4
        System.out.println("------------------------------------------");


        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        Iterator <Integer> iter = queue.iterator();
        System.out.println("Queue - "+queue);
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println("poll -"+queue.poll());
        System.out.println("Queue - "+queue);
        System.out.println("------------------------------------------");

        //DeQueue
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(3);
        System.out.println("Added at front - "+deque);
        deque.offerFirst(5);
        System.out.println("Added at front - "+deque);
        deque.offerLast(7);
        System.out.println("Added at last - "+deque);
        deque.offerFirst(9);
        System.out.println("Added at front - "+deque);
        deque.offerLast(30);
        System.out.println("Added at last - "+deque);
        deque.offerFirst(34);
        System.out.println("Added at front - "+deque);
        deque.offerLast(3);
        System.out.println("Added at last - "+deque);
        Iterator <Integer> it = deque.iterator();
        System.out.println("Deque - "+deque);
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println("polled first -"+deque.pollFirst());
        System.out.println("Queue - "+deque);
        System.out.println("polled last -"+deque.pollLast());
        System.out.println("Queue - "+deque);
        System.out.println("------------------------------------------");


        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(70);
        stack.push(6);
        System.out.println("Stack - "+stack);
        System.out.println("Popped - "+stack.pop());
        System.out.println("Stack - "+stack);
        System.out.println("------------------------------------------");


        //PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->b-a);
        priorityQueue.offer(89);
        priorityQueue.offer(55);
        priorityQueue.offer(100);
        priorityQueue.offer(67);
        priorityQueue.offer(89);
        System.out.println("Priority Queue - "+priorityQueue);
        System.out.println("------------------------------------------");

        //Set
        Set<Integer> set = new HashSet<>(list);
        System.out.print("Set - ");
        for(int ele : set){
            System.out.print(ele+" ");
        }
        System.out.println("------------------------------------------");

        //LinkedSet
        Set<Integer> linkedSet = new LinkedHashSet<>(list);
        System.out.print("Linked Set - ");
        for(int ele : linkedSet){
            System.out.print(ele+" ");
        }
        System.out.println("------------------------------------------");

        //HashMap
        Map<String,Integer> map  = new HashMap<>();
        map.put("Aman",1);
        map.put("Am",2);
        map.put("Ama",45);
        map.put("An",43);
        map.put("Aan",5);
        System.out.println("Map - "+map);
        System.out.println(map.getOrDefault("A", null));

        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry : entries){
            System.out.println("Printing by entryset " +entry);
        }

        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println("Printing by keyset "+key+" = "+map.get(key));
        }
        System.out.println("------------------------------------------");
        
        //Adjacent Matrix
        //1->2,3
        //2->4,5
        //3->
        //4->5

        Map<Integer,List<Integer>> adjacent  = new HashMap<>();
        if(adjacent.get(1)==null){
            adjacent.put(1,new ArrayList<>());
        }
        adjacent.get(1).add(2);
        adjacent.get(1).add(3);

        if(adjacent.get(2)==null){
            adjacent.put(2,new ArrayList<>());
        }
        adjacent.get(2).add(4);
        adjacent.get(2).add(5);

        if(adjacent.get(3)==null){
            adjacent.put(3,new ArrayList<>());
        }

        if(adjacent.get(4)==null){
            adjacent.put(4,new ArrayList<>());
        }
        adjacent.get(4).add(5);

        if(adjacent.get(5)==null){
            adjacent.put(5,new ArrayList<>());
        }
        adjacent.get(5).add(1);

        System.out.println("Adjacent Matrix - "+adjacent);

        Set<Map.Entry<Integer,List<Integer>>> entries2 = adjacent.entrySet();
        for(Map.Entry<Integer,List<Integer>> entry2:entries2){
            System.out.println("Printing By entrySet "+entry2);
        }
   
    }
}
