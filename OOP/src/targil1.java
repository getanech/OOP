import java.util.LinkedList;
import java.util.Queue;

public class targil1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(4);
        queue.add(5);
        queue.add(3);
        queue.add(7);
        queue.add(2);
        queue.add(6);
        queue.add(9);
        queue.add(5);
        queue.add(2);
        queue.add(5);
        queue.add(2);
        queue.add(5);
        queue.add(2);
        System.out.println(onlyRepatedNumbers(queue));
    }
    public static Queue<Integer> onlyRepatedNumbers(Queue<Integer> queue){
        Queue<Integer> queue1 = new LinkedList<Integer>();
        int count = 0;
        int num = 0;
        while (!queue.isEmpty()){
            count = 0 ;
            num = queue.poll();
            for(int n : queue){
                if (n == num){
                    count ++;
                }
            }
            if (count >= 2 && !queue1.contains(num)){
                queue1.add(num);
            }
        }return queue1;
    }
}
