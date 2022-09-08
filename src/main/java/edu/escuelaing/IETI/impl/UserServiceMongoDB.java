package edu.escuelaing.IETI.impl;

import edu.escuelaing.IETI.entities.User;
import edu.escuelaing.IETI.repository.UserRepository;
import edu.escuelaing.IETI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceMongoDB implements UserService {


    UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository) {

        this.userRepository = userRepository;
    }
    @Override
    public User create(User user) {
        userRepository.save(user);
        return null;
    }

    @Override
    public User findById(String id) {

        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(User user, String userId) {
        userRepository.save(user);
        return null;
    }

    public List<User> findWithNameOrLastname(String queryText){
        return userRepository.findUsersWithNameOrLastNameLike(queryText);
    }

    @Override
    public List<User> findUsersCreatedAfter(Date startDate) {
        return null;
    }


}
