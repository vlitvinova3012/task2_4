package ru.diasoft.homework2_4.service;


import ru.diasoft.homework2_4.domain.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface AuthorEntityService {
    List<AuthorEntity> findAll();

    Optional<AuthorEntity> findById(Long id);

    void saveByName(String name);

    AuthorEntity findByName(String name);

    void deleteById(Long id);
}
