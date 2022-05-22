package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Class obj = new Class(8);
        obj.Show_Value();
        Class obj1 = new Class();
        obj1.Show_Value();
    }
}

class Class{
    private int value;

    public Class(int value){
        this.value = value;
    }
    public Class(){
        this.value = 1;
    }

    void Show_Value(){
        System.out.printf("Value: %d\n", value);
    }
}
