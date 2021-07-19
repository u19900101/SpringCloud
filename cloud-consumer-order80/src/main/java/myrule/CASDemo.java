package myrule;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author pppppp
 * @date 2021/7/9 9:41
 */
public class CASDemo {
    public static void main(String[] args){
      AtomicInteger atomicInterger = new AtomicInteger(5);

        boolean compareAndSet = atomicInterger.compareAndSet(5, 2021);
        System.out.println(compareAndSet + " current atomicInteger is " + atomicInterger.get());
        System.out.println(atomicInterger.compareAndSet(5, 2022) + " current atomicInteger is " + atomicInterger.get());
    }
}
