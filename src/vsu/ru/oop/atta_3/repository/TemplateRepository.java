package vsu.ru.oop.atta_3.repository;

import org.hibernate.sql.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vsu.ru.oop.atta_3.entity.Document;

@Repository
public interface TemplateRepository extends JpaRepository<Document,DocumentRepository> {
}
