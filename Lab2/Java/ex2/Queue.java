package Java_Lab2.ex2;
import java.util.ArrayList;

public class Queue {
    int maxSize;
    boolean parameter;
    ArrayList<Integer> list;
    Queue(){

        list = new ArrayList<Integer>();
        parameter = false;
        System.out.println("not full");
    }

    Queue(int maxSize){
        list = new ArrayList<Integer>();
        this.maxSize = maxSize;
        parameter = true;
    }

    public void push(int value){

        list.add(value);

        if(parameter){
            if(list.size() < maxSize){
                list.add(value);
            }
        }
        else list.add(value);
    }

    public  int pop(){
        int a = list.get(0);
        list.remove(0);
        return  a;
    }


}