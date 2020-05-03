package com.leetcode.solutions;

import java.util.HashSet;
import java.util.Scanner;

public class Soln {
    public static void main(String[] args) {
        System.out.print("Enter the size of linked hash set: ");
        Scanner s = new Scanner(System.in);  // Create a Scanner object
        int size = s.nextInt();
            HashSet<String> lhashset = new HashSet<>(size);
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter the name: ");
            String name = s.next();
            lhashset.add(name);
        }
            System.out.println("\nEnter the name you want to find: ");
            String find = s.next();
            if(lhashset.contains(find))
            {       
                System.out.println("\nYes the Linked Hash Set contains " +find);
                System.out.print("Do you want to remove the name? ");
                String ch = s.next();
            String choice = "yes";
                if(ch.equals(choice))
                {
                        lhashset.remove(find);
                        System.out.println("\nElement removed.");
                }
                else
                {
                        System.out.println("\nGoodbye");
                }
            }
            else
            {
                System.out.println("Does not contain name.");
            }
    }
}
