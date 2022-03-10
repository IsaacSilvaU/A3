package org.ada.school.user.service;

import org.ada.school.user.controller.dto.UserDto;
import org.ada.school.user.model.User;

import java.util.List;


public interface UserService
{
    User create( User user );

    User findById(String id );

    //List<User> findUsersWithNameOrLastNameLike(String queryText);

    //List<User> findUsersCreatedAfter(Date startDate);

    List<User> all();
    //List<User> all(String id);

    boolean deleteById( String id );

    User update( UserDto userDto, String id );
}
