package ppppp.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author pppppp
 * @date 2021/7/9 16:02
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
