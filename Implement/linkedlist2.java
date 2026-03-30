//linked list using frame works.
import java.util.*;
class linkedlist2{
public static void main(String [] args){
    LinkedList<String> list = new LinkedList<String>();

    list.addFirst("a");
    list.addFirst("is");
    System.out.println(list);

    list.addLast("what");
    System.out.println(list);

    list.add("this");//add->automatically addition in last
    System.out.println(list);

    System.out.println(list.size());

    for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+"->");
    }
    System.out.println("null");


    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);

    list.remove(1);
    System.out.println(list);
}
}