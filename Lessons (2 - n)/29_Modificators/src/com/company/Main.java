package com.company;

import Shop_packet.*;

public class Main{

    public static void main(String[] args) {
	// write your code here
        var p = new Product();
        // имеем доступ к полю product
        // но не имеем к euro
        p.product = "milk";

        System.out.println(Product.ten);
        System.out.println(p.product);
    }
}

// public - общедоступный (за пределы класса)
// private - закрытый (внутри класса)
// protected - как private, но при наследовании становится доступным
// default - по умолчанию (модификатор доступа в пакете)
// доступно в пределах пакета

class Test{
}

class Beer{

}

class Class{

}

// в пределах одного java-файла должен быть только один
// общедоступный класс
