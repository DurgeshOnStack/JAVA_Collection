package com.collection;
import java.util.*;
public class DrawingAppUndoPollLast {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no of actions:");
     int no=Integer.parseInt(sc.nextLine().trim());
     LinkedList<String>totalActions=new LinkedList<String>();
        if(no>0){
            for(int i=1;i<=no;i++){
            	System.out.println("Enter action "+i+" : ");
                String action=sc.nextLine();
                totalActions.add(action);
            }
        }
        if(!(totalActions.isEmpty())){
        System.out.println("Undone action: "+totalActions.get(sc.nextInt()));
        totalActions.remove(no-1);
       System.out.println("Remaining actions: "+totalActions);
        }
        else{
           System.out.println("No actions to undo Remaining actions: "+totalActions); 
        }
    }
}
