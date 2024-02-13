package org.najot.magazinproject.repository;

import org.najot.magazinproject.entity.AcceptDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AcceptDocumentRepository extends JpaRepository<AcceptDocument,Long> {
}
