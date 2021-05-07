package org.hank.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.hank.springcloud.entity.Payment;

/**
 * @author Hank
 * @date 2021/2/26
 */

public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
