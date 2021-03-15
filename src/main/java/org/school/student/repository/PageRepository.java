package org.school.student.repository;

import org.school.student.entity.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageRepository  extends JpaRepository<Page,Long> {
}
