package com.quan.eurekaserverpeer1.java8;

public class LambdaUsage {

    @FunctionalInterface
    public  interface  Adder{
        int add(int a, int b);
    }

    public static void main(String[] args) {
        Runnable r1 = ()-> System.out.println("1111");

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("111");
            }
        };

        process(r1);
        process(r2);
        process(()-> System.out.println("1111"));

    }


    private static void process(Runnable runnable){
        runnable.run();
    }
}
