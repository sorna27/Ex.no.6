/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package que;

import java.util.Scanner;

/**
 *
 * @author meena
 */
public class Que {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=1,d,s;
        queueoperations obj=new queue();
        Scanner obj1=new Scanner(System.in);
        System.out.println("1:enqueue\n2:dequeue\n3:display\n4:stop");
        while(n!=0)
        {
            
            d=obj1.nextInt();
            if(d==1)
            {
                System.out.println("Enter the element to be inserted...");
                s=obj1.nextInt();
                obj.enqueue(s);          
            }
            else if(d==2)
            {
                obj.dequeue();
                System.out.println("Element is deleted...");
            }
            else if(d==3)
            {
                System.out.println("QUEUE ELEMENTS...");
                obj.display();
            }
            else if(d==4)
            {
                n=0;
            }
            else
            {
                System.out.println("Wrong input...");
            }
            
        }
    }
    
}
interface queueoperations
{
    void enqueue(int value);
    void dequeue();
    void display();
    
}
class queue implements queueoperations
{
        
    int front=0;
    int rear=0;
    int max=10;
    int n=0;
    int q[]=new int[10];
    public void enqueue(int value)
    {
        if(rear==max)
        {
            System.out.println("Can not insert.Queue is full...");
        }
        if(rear<max)
        {
            q[rear]=value;
            rear++;
            n++;
        }
    }
    public void dequeue ()
    {
        if(rear==front)
        {
            System.out.println("Can not delete.Queue is empty...");
        }
        else
        {
        front++;
        }
        
        
    }
    public void display()
    {
        for (int i=front;i<n;i++)
            
        {
            System.out.print(q[i]+"-->");
            
        }
        System.out.print("\n");
    }
}