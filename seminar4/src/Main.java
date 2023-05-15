import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        //Задача 1
        LinkedList<Integer> llsrc = new LinkedList<Integer>();
        LinkedList<Integer> lldst = new LinkedList<Integer>();
        for (int i = 0; i < 30; i++) {
            Random random = new Random();
            llsrc.add((Integer) random.nextInt(100));
            System.out.print(llsrc.getLast() + " ");
        }
        for (int i = 0; i < 30; i++) {
            lldst.add(llsrc.pollLast());
        }
        System.out.println("");
        for (int i = 0; i < 30; i++) {
            System.out.print(lldst.get(i) + " ");
        }
        System.out.println("");

        //Задача 2
        Queue q = new Queue<Integer>();
        for (int i = 0; i < 10; i++) {
            q.enqueue((Integer)i);
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(q.dequeue() + " ");
        }

        //Задача 3
        System.out.println("\n" + q.first());
        Integer sum = 0;
        for (int i = 0; i < 30; i++) {
            sum += lldst.iterator().next();
        }
        System.out.print(sum);

    }
}
class Queue<T>{
    LinkedList<T> ll = new LinkedList<T>();
    public void enqueue(T obj){
        ll.add(obj);
    }
    public T dequeue(){
        return ll.pollFirst();
    }
    public T first(){
        return ll.getFirst();
    }

}
    //Задача 4
class Queue2<T>{
    Object[] ll = new Object[16];
    int curElem = 0;
    int firstElem = 0;
    public void enqueue(T obj){
        if(curElem + 1 == ll.length){
            updateArr();
        }
        ll[curElem] = obj;
        curElem++;
    }
    public T dequeue(){
        if(firstElem > curElem){
            return null;
        }
        T elem = (T)ll[firstElem];
        firstElem++;
        return elem;

    }
    public T first(){
        if(firstElem > curElem){
            return null;
        }
        return (T)ll[firstElem];
    }
    void updateArr(){
        if(firstElem > ll.length / 2){
            firstElem -= ll.length / 2;
            curElem -= ll.length / 2;
            ll = Arrays.copyOfRange(ll,ll.length / 2,ll.length);
        }
        ll = Arrays.copyOf(ll,ll.length * 2);
    }
}