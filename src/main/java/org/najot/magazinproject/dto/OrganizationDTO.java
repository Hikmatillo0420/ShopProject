package org.najot.magazinproject.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDTO {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;

}
