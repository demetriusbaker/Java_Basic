package com.company;

public class Main {

    public static void main(String[] args) {
	// String - неизменяемый тип данных
        String x = "deFaulT";
        x.toUpperCase(); // так x не изменится вообще!
        System.out.println(x);
        x = x.toUpperCase(); // а так - изменится!
        System.out.println(x);

        String hi = "Hi! Mike is ";
        String hi1 = "here ";
        System.out.println(hi + hi1);

        // SB крут тем, что нет необходимости при каждой конкатенации
        // создавать отдельный объект класса
        // а это экономит память

        StringBuilder sb = new StringBuilder("This is text!");
        System.out.println(sb.toString());
        sb.append(" It's appended text!");
        sb.append(" 0123456789");
        System.out.println(sb.append("EEEEEEEEEEEEEEEEEEEE!").toString());
    }
}
