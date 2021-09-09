
package com.mycompany.datastructures2;


public class Queue {
        private int[] values;
    private int front,rear;
    
    public Queue(int size){
        front = -1;
        rear = -1;
        values = new int[size];
    }
    
    public void append(int num)
    {
        int element;
        if(isFull())
        {
            element = values[front];
            System.out.printf("Dequeued Element: %d%n",element);
            front = (front+1)%values.length;
            rear = (rear + 1)%values.length;
            values[rear] = num;
            throw new StackException("Stack Full");
        }
        else
        {
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear + 1)%values.length;
            values[rear] = num;
        }
    }
    
    public void get()
    {
        if(isEmpty())
        {
            throw new QueueException("Queue Empty");
        }
        else{
            for(int i = 0; i<values.length;i++)
            {
                System.out.printf("%d ",values[i]);
            }
        }   
    }
    
    public boolean isEmpty()
    {
        if (front == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isFull()
    {
        if(front == 0 && rear == values.length-1)
        {
            return true;
        }
        if(front == rear + 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void peek()
    {
        
    }
    
}
