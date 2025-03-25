package ru.diasoft.homework2_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.diasoft.homework2_4.domain.GenreEntity;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
    @Modifying
    @Query(value = "INSERT INTO Genre (name) VALUES (:name)", nativeQuery = true)
    void saveByName(@Param("name") String name);

    GenreEntity findByName(String name);

}
