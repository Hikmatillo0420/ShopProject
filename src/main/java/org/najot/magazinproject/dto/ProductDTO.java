package org.najot.magazinproject.dto;

import lombok.*;
import org.najot.magazinproject.entity.AcceptDocumentItem;
import org.najot.magazinproject.entity.StoreProduct;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private Long CategoryId;
    private Long MeasureType;
    private Long amount;
}
