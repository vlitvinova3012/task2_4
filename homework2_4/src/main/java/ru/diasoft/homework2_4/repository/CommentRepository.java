package ru.diasoft.homework2_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.diasoft.homework2_4.domain.CommentEntity;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    @Modifying
    @Query(value = "INSERT INTO Comment (comment) VALUES (:comment)", nativeQuery = true)
    void saveByComment(@Param("comment") String comment);

    CommentEntity findByComment(String comment);
}
