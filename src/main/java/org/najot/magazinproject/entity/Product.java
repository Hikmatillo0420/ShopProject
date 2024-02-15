package org.najot.magazinproject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CategoryId",referencedColumnName = "id")
    private Category category;

    @ManyToOne()
    @JoinColumn(name = "MeasureTypeId",referencedColumnName = "id")
    private Measurement measurements;

    private Long amount;

    @OneToMany(mappedBy = "product")
    private Set<AcceptDocumentItem> documentItem;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private StoreProduct storeProduct;


}
