package org.najot.magazinproject.dto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductPriceDTO {
    private Long id;
    private Long produceId;
    private Long price;
    private LocalDate date;
    private Boolean status;

}
