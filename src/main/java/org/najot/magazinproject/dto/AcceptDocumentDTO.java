package org.najot.magazinproject.dto;

import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocumentDTO {
    private Long id;
    private Integer docNumber;
    private Long organizationId;
    private LocalDate data;

}
