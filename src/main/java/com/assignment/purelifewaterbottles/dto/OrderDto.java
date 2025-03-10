package com.assignment.purelifewaterbottles.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDto {
    private String orderId;
    private String customerId;
    private String deliveryId;
    private String orderDate;
    private String description;
}
