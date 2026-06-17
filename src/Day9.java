import java.util.LinkedList;
public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("joseph");
        queue.add("subasree");
        queue.add("srinithi");
        queue.add("archana");
        queue.add("deva");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}