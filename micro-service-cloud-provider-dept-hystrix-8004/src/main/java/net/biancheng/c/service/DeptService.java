package net.biancheng.c.service;

public interface DeptService {

    /**
     * hystrix 熔断器示例 ok
     */
    String deptInfo_Ok(Integer id);


    /**
     * hystrix 熔断器超时案例

     */
    String deptInfo_Timeout(Integer id);

    /**
     * Hystrix 熔断机制案例
     */
    public String deptCircuitBreaker(Integer id);
}
