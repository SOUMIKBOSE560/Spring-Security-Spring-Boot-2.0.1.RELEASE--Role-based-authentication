package net.springsecurity.SpringSecurityRoleBasedAuth.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Product {
    private int id;
    private String name;
    private int price;
}
