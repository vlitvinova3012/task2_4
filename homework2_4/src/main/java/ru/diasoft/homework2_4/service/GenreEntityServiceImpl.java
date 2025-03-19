package ru.diasoft.homework2_4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.diasoft.homework2_4.domain.GenreEntity;
import ru.diasoft.homework2_4.repository.GenreRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenreEntityServiceImpl implements GenreEntityService {
    private final GenreRepository repository;

    @Transactional(readOnly = true)
    @Override
    public List<GenreEntity> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<GenreEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public GenreEntity findByName(String name) {
        return repository.findByName(name);
    }

    @Transactional
    @Override
    public void saveByName(String name) {
        repository.saveByName(name);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
