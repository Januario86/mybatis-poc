package org.fj.mapper;

import org.fj.model.User;

import java.util.List;

public interface UserMapper{
        List<User> findAll();
        User findById(Long id);
        void insert(User user);
        void update(User user);
        void delete(Long id);

}
