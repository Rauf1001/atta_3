package vsu.ru.oop.atta_3.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import vsu.ru.oop.atta_3.entity.Document;
import vsu.ru.oop.atta_3.repository.DocumentRepository;


import java.util.Optional;
import java.util.UUID;


@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Transactional
    public Document updateDocument(UUID id, String name, int age, int lessons_count, String body) {
        Optional<Document> documentOpt = documentRepository.findById(id);

        if (documentOpt.isEmpty()) {
            throw new RuntimeException("Не найден id: " + id);
        }

        Document document = documentOpt.get();
        document.setDocument_name(name);
        document.setDocument_age(age);
        document.setDocument_lessonscount(lessons_count);
        document.setDocument_body(body);

        return documentRepository.save(document);
    }

    @Transactional
    public Document addNewDocument(String name, int age, int lessons_count, String body) {
        Document document = new Document();
        document.setDocument_id(UUID.randomUUID());
        document.setDocument_name(name);
        document.setDocument_age(age);
        document.setDocument_lessonscount(lessons_count);
        document.setDocument_body(body);

        return documentRepository.save(document);
    }

    @Transactional
    public void delDocumentById(UUID id) {
        documentRepository.deleteById(id);
    }

}
