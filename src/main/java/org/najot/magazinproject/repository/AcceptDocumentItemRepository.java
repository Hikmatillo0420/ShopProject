package org.najot.magazinproject.repository;

import org.najot.magazinproject.entity.AcceptDocumentItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptDocumentItemRepository extends JpaRepository<AcceptDocumentItem,Long> {
}
