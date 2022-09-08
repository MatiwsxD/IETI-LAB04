package edu.escuelaing.IETI.repository;

import edu.escuelaing.IETI.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String>
  {
     @Query("{$or: [{name: ?0}, {lastname: ?0}]}")
     List<User> findUsersWithNameOrLastNameLike(String queryText);

  }