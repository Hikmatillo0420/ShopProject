package org.najot.magazinproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer docNumber;

    @ManyToOne()
    @JoinColumn(name = "organizationId",referencedColumnName = "id")
    private Organization organization;

    private LocalDate data;

    @OneToMany(mappedBy = "document")
    private Set<AcceptDocumentItem> acceptDocumetItemSet;
}
