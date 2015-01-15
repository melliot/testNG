package com.collections.java.alexis;

public class AllTypesOfDataStructures {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.add(10);
        queue.add(10);
        queue.add(10);
        queue.add(10);
        queue.add(10);
        queue.add(10);

        System.out.println(queue);
        System.out.println(queue.get(0));

        queue.remove(3);
        System.out.println(queue);

        System.out.println("Stack");
        MyStack stack = new MyStack();
        stack.add(19);
        System.out.println(stack);
        stack.add(10);
        stack.add(9);
        stack.add(7);
        stack.add(5);
        stack.add(5);
        stack.add(5);
        stack.add(5);
        stack.add(1);
        stack.add(1);
        System.out.println(stack);
        stack.add(888);
        System.out.println(stack);
    }
}
class Queue{
    private int [] queue;
    private int index = 0;

    Queue(int size){
        queue = new int [size];
    }
    Queue(){
        queue = new int [10];
    }

    public void add(int elem){
        this.queue[index++] = elem;
    }

    public int get(int pos){
        if(pos < 0 || pos > queue.length - 1){
            throw new IllegalArgumentException("Don't existed index");
        }
        else return this.queue[pos];
    }

    public void remove(int pos){
        System.arraycopy(queue, pos, queue, pos-1, queue.length-pos-1);

    }

    @Override
    public String toString() {
        String array = "";
        for (int i : queue) {
            array += i + ";  ";
        }
        return array;
    }
}
class MyStack{
    private int size;
    private int [] stack;
    private int index;

    MyStack(int size){
        stack = new int[size];
    }
    MyStack(){
        stack = new int[10];
    }
    public void add(int elem){
        if(index == stack.length - 1){
            System.out.println("It's a final element");
        }
        else if(index == stack.length){

            int temp [] = new int[stack.length * 3];

            System.arraycopy(stack, 0, temp, 0, stack.length);

            stack = temp;
        }
        System.arraycopy(stack, 0, stack, 1, stack.length-1);
        stack[0] = elem;
        index++;
    }
    public int get(int pos){
        if(pos < 0 || pos > stack.length - 1){
            throw new IllegalArgumentException("Don't existed index");
        }
        else return stack[pos];
    }
    @Override
    public String toString() {
        String array = "";
        for (int i : stack) {
            array += i + ";  ";
        }
        return array;
    }
}
class MyLinkedList {
    private MyLinkedList next;
    private MyLinkedList prev;
    MyLinkedList(){
        next = this;
        prev = this;
    }
    public void add(MyLinkedList elem){

    }
}
