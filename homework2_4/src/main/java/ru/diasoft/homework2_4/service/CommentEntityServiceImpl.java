package ru.diasoft.homework2_4.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.diasoft.homework2_4.domain.CommentEntity;
import ru.diasoft.homework2_4.repository.CommentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentEntityServiceImpl implements CommentEntityService {
    private final CommentRepository repository;

    @Transactional(readOnly = true)
    @Override
    public List<CommentEntity> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<CommentEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public CommentEntity findByComment(String comment) {
        return repository.findByComment(comment);
    }

    @Transactional
    @Override
    public void saveByComment(String comment) {
        repository.saveByComment(comment);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
