package ppppp.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author pppppp
 * @date 2021/7/9 16:03
 */
@Component//需要跟主启动类同包，或者在其子孙包下。
public class MyLB implements LoadBalancer {

        private AtomicInteger atomicInteger = new AtomicInteger(0);
        // 解决可能出现的 ABA 问题
        AtomicStampedReference<Integer> lbIndex = new AtomicStampedReference<>(0,0);

        public final int getAndIncrement()
        {
            boolean compareAndSet = lbIndex.compareAndSet(lbIndex.getReference(), lbIndex.getReference() + 1,
                    lbIndex.getStamp(), lbIndex.getStamp() + 1);
            if(!compareAndSet){
                System.out.println("lbIndex Error");
            }
            int next = lbIndex.getReference();
            System.out.println("*****访问次数next: "+next);
            return next;
           /* int current;
            int next;
            do {
                current = this.atomicInteger.get();
                next = current >= Integer.MAX_VALUE ? 0 : current + 1;
            }while(!this.atomicInteger.compareAndSet(current,next));
            System.out.println("*****访问次数next: "+next);
            return next;*/
        }

        //负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标  ，每次服务重启动后rest接口计数从1开始。
        @Override
        public ServiceInstance instances(List<ServiceInstance> serviceInstances)
        {
            int index = getAndIncrement() % serviceInstances.size();

            return serviceInstances.get(index);
        }
}
