package com.collection;
import java.util.*;
public class Notification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter max no. of notifications: ");
        int numberNotification=sc.nextInt();
        sc.nextLine();
        ArrayList<String> notification=new ArrayList<String>();
        if(numberNotification>0){
              for(int i=1;i<=numberNotification;i++){
            	  System.out.println("Enter the notifications: ");
                String message=sc.nextLine();
                notification.add(message);
              }
        
        System.out.println("Unread Notifications:");
        Iterator i=notification.iterator();
        while(i.hasNext())
        {
        System.out.println("Notification: "+i.next());
        }
    }
}
}
