package org.ada.school.user.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

public class UserDocument
{
    //@Id
    String id;
    String name;

    //@Indexed(unique = true)
    String email;
    String lastName;
    Date createdAt;

    public UserDocument(){
    }
}
