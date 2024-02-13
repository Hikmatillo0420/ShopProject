package org.najot.magazinproject.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentItemDTO {
    private Long id;
    private Integer documentId;
    private Long product_id;
    private Double comePrice;
    private Long count;

}
