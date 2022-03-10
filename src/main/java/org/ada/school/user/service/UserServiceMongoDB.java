package org.ada.school.user.service;

import org.ada.school.user.controller.dto.UserDto;
import org.ada.school.user.model.User;
import org.ada.school.user.repository.UserDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceMongoDB implements UserService{

    private final UserRepository userRepository;

    public UserServiceMongoDB(UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findById(String id) {
        return userRepository.findUserById(id);
    }

    @Override
    public List<User> all() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteById(String id) {
        //userRepository.deleteById(id);
        //return true;

        if (userRepository.findById(id).isPresent()){
            userRepository.deleteById(id);
            return true;
        }
        return false;

    }

    @Override
    public User update(UserDto userDto, String id) {
        if (userRepository.findById(id).isPresent()){
            User user = userRepository.findById(id).get();
            user.update(userDto);
            userRepository.save(user);
            return user;
        }
        return null;
    }
}
