package pl.arit.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.arit.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
