package vsu.ru.oop.atta_3.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import vsu.ru.oop.atta_3.entity.Document;


@NoRepositoryBean
public interface DocumentRepository extends JpaRepository<Document, UUID> {
}

