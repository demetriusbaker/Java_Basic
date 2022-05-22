package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LvsAClass {
    public static void show(){
        LvsAClass lvsAClass = new LvsAClass();
        lvsAClass.showTimeWork(new LinkedList(), 1000);
        lvsAClass.showTimeWork(new ArrayList(), 1000);
        lvsAClass.showTimeWork(new LinkedList(), 1000000);
        lvsAClass.showTimeWork(new ArrayList(), 1000000);
    }

    public void showTimeWork(List list, int size){
        String info = "";

        if (list instanceof ArrayList)
            info = "ArrayList";
        if (list instanceof LinkedList)
            info = "LinkedList";

        Date currentTime = new Date();

        for (int i = 0; i < size; i++) {
            list.add(i, new Object());
        }

        Date NowTime = new Date();

        System.out.println("Time " + info + ": " + (NowTime.getTime() - currentTime.getTime()));
    }
}
