package org.hank.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Hank
 * @date 2021/5/7
 */
@Service
public class PaymentService {
    /**
     * 正常访问的方法
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentInfo_OK,id: " + id + "\t" + "0(n_n)0哈哈~";
    }

    /*@HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })*/
    public String paymentInfo_TimeOut(Integer id) {

        try {
            TimeUnit.MILLISECONDS.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池:  " + Thread.currentThread().getName() + " paymentInfo_TimeOut,id:  " + id + "\t" + "O(∩_∩)O哈哈~" + "  耗时(秒): 3";
    }

    // 用来善后的方法
    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池:  "+Thread.currentThread().getName()+"  8001系统繁忙或者运行报错，请稍后再试,id:  "+id+"\t"+"o(╥﹏╥)o";
    }
}
