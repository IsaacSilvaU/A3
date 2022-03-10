package org.ada.school.user.controller;

import org.ada.school.user.controller.dto.UserDto;
import org.ada.school.user.model.User;
import org.ada.school.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping( "/user" )
public class UserController
{

    private final UserService userService;

    public UserController( @Autowired UserService userService )
    {
        this.userService = userService;
    }


    /*@GetMapping
    public ResponseEntity<List<User>> all()
    {
        return ResponseEntity.ok( userService.all() );
    }*/

    @GetMapping("/all")
    public List<User> all()
    {
        return userService.all();
    }

    @GetMapping( "/{id}" )
    public User findById(@PathVariable("id") String id )
    {
        return userService.findById( id );
    }

    @PostMapping
    public User create( @RequestBody UserDto userDto )
    {
        return userService.create( new User( userDto ));
    }

    @PutMapping( "/{id}" )
    public User update( @RequestBody UserDto userDto, @PathVariable String id )
    {
        return userService.update( userDto, id );
    }

    @DeleteMapping( "/{id}" )
    public boolean delete( @PathVariable String id )
    {
        return userService.deleteById( id );
    }

}
