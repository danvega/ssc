package dev.danvega.ssc.repository;

import dev.danvega.ssc.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post,Integer> {
}
