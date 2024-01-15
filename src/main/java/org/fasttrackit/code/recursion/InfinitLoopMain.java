package org.fasttrackit.code.recursion;

public class InfinitLoopMain {
    public static long counter = 1;

    public static void main(String[] args) {
        doSomething();
    }

    private static void doSomething() {
        if (counter % 9 == 0) {
            return;
        }
        if (counter >= 100) {
            return;
        }
        System.out.println(++counter);
        doSomething();
    }
}
