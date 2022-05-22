package com.company;

import list.ArrayAndLinkedList;
import list.SimpleArray;
import mapClasses.*;
import queue.*;
import set.*;
import stack.StackDIY;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit){
            System.out.println("Choose:");
            System.out.println("0) EXIT");
            System.out.println("1) SimpleEnumMap");
            System.out.println("2) SimpleIdentityHashMap");
            System.out.println("3) SimpleArray");
            System.out.println("4) ArrayAndLinkedList");
            System.out.println("5) SimpleQueue");
            System.out.println("6) ArrayDeque");
            System.out.println("7) QueueDIY");
            System.out.println("8) StackDIY");
            System.out.println("9) SetClass");
            System.out.println("10) TreeSetClass");
            System.out.println("11) SimpleWeakHashMap");
            System.out.println("12) HashMapClass");
            System.out.println("13) MapAnimals");
            System.out.println("14) NavigableMapClass");
            switch (scanner.next()){
                case "0" -> isExit = true;
                case "1" -> SimpleEnumMap.show();
                case "2" -> SimpleIdentityHashMap.show();
                case "3" -> SimpleArray.show();
                case "4" -> ArrayAndLinkedList.show();
                case "5" -> SimpleQueue.show();
                case "6" -> ArrayDequeClass.show();
                case "7" -> QueueDIY.show();
                case "8" -> StackDIY.show();
                case "9" -> SetClass.show();
                case "10" -> TreeSetClass.show();
                case "11" -> SimpleWeakHashMap.show();
                case "12" -> HashMapClass.show();
                case "13" -> MapAnimals.show();
                case "14" -> NavigableMapClass.show();
                case "15" -> {}
                case "16" -> {}
                case "17" -> {}
                case "18" -> {}
                default -> System.out.println("Incorrect input!");
            }
        }
    }
}
