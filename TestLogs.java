package com.collection;
import java.util.*;
public class TestLogs {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter No. of logs: ");
        int entries=Integer.parseInt(sc.nextLine());
            ArrayList<String> logList=new ArrayList<String>();
        if(entries>=1){
            for(int i=1;i<=entries;i++){
            	System.out.println("Enter "+i+" log: "); 
                String log=sc.nextLine();
                logList.add(log);
            }
        }
            System.out.println("Processing logs:");
        Iterator i=logList.iterator();
        while(i.hasNext()){
            System.out.println("Processing: "+i.next());
        }
    }
    }

