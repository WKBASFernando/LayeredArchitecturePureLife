package com.assignment.purelifewaterbottles.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemOriginal {
    private String itemId;
    private String name;
    private String capacity;
    private double price;
}
