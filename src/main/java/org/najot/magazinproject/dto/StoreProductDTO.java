package org.najot.magazinproject.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.najot.magazinproject.entity.Product;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StoreProductDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Product produceId;
    private Double amount;
}
