package com.jacacourse.course.services;

import com.jacacourse.course.entities.User;
import com.jacacourse.course.repositories.UserRepository;
import com.jacacourse.course.services.exceptions.DatabaseException;
import com.jacacourse.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insertUser(User user){
        return repository.save(user);
    }

    public void deleteUser(Long id){
        try {
            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }

    }

    public User updateUser(Long id, User user){
        User entity = repository.getOne(id);
        updateDataUser(entity, user);
        return repository.save(entity);
    }

    private void updateDataUser(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
