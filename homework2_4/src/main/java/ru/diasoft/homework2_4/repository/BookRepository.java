package ru.diasoft.homework2_4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.diasoft.homework2_4.domain.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
    @Modifying
    @Query(value = "INSERT INTO Book (title, author_id, genre_id, comment_id) VALUES (:title, :author_id, :genre_id, :comment_id)", nativeQuery = true)
    void saveBook(@Param("title") String title,
                  @Param("author_id") Long authorId,
                  @Param("genre_id") Long genreId,
                  @Param("comment_id") Long commentId);

    @Query(value = "SELECT * FROM Book WHERE title = :title", nativeQuery = true)
    BookEntity findByTitle(@Param("title") String title);
}
