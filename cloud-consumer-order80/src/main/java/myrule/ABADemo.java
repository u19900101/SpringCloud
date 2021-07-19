package myrule;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author pppppp
 * @date 2021/7/9 11:08
 */
public class ABADemo {
    public static void main(String[] args){

      /*  System.out.println("=======ABA问题的产生==========");
        AtomicReference<Integer> atomicReference = new AtomicReference<>(100);
        new Thread(()->{
            atomicReference.compareAndSet(100,101);
            System.out.println("done something unknown");
            atomicReference.compareAndSet(101,100);
        },"t1").start();

        new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean compareAndSet = atomicReference.compareAndSet(100, 2021);
            System.out.println("t2 修改结果  "+compareAndSet + "\t" + atomicReference.get());
        },"t2").start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=======ABA问题的解决==========");
        AtomicStampedReference<Integer> stampedReference = new AtomicStampedReference<>(100,1);
        new Thread(()->{
            int stamp = stampedReference.getStamp();
            System.out.println("t3 第一次修改时的版本号为：   " + stamp);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("done something unknown");
            stampedReference.compareAndSet(100,101,stamp,stampedReference.getStamp()+1);
            stampedReference.compareAndSet(101,100,stampedReference.getStamp(),stampedReference.getStamp()+1);
            stampedReference.compareAndSet(100,101,stampedReference.getStamp(),stampedReference.getStamp()+1);

        },"t3").start();

        new Thread(()->{
            int stamp = stampedReference.getStamp();
            System.out.println("t4 第一次修改时的版本号为：  " + stamp);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean compareAndSet = stampedReference.compareAndSet(100, 101, stamp, stampedReference.getStamp() + 1);

            System.out.println(compareAndSet + "\t" + stampedReference.getReference() + "\n" + "当前版本号为： " + stampedReference.getStamp());
        },"t4").start();*/

    }

    @Test
    public void T_k(){
        System.out.println(Integer.MAX_VALUE);
    }
}
