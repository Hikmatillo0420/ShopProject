package org.najot.magazinproject.repository;

import org.najot.magazinproject.entity.StoreProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreProductRepository extends JpaRepository<StoreProduct,Long> {
}
