package ru.diasoft.homework2_4.service;


import org.springframework.transaction.annotation.Transactional;
import ru.diasoft.homework2_4.domain.GenreEntity;

import java.util.List;
import java.util.Optional;

public interface GenreEntityService {
    List<GenreEntity> findAll();
    Optional<GenreEntity> findById(Long id);
    void deleteById(Long id);
    GenreEntity findByName(String name);
    void saveByName(String name);
}
