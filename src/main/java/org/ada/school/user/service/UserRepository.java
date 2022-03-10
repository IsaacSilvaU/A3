package org.ada.school.user.service;

import org.ada.school.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    User save(User user);

    User findUserById(String id);

    List<User> findAll();

    void deleteById(String id );

    // Optional<User> findById(String id);

    //List<User> findUsersWithNameOrLastNameLike(String queryText);

    //List<User> findUsersCreatedAfter(Date startDate);

    //User update(UserDto userDto, String id );
}
