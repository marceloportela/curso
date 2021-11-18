package com.m4u.curso.services;
import com.m4u.curso.model.User;
import com.m4u.curso.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }
    public List<User> createUserList(List<User> list) {
        return userRepository.saveAll(list);
    }
    public List<User> getUserList() {

        return userRepository.findAll();
    }
    public User getUserById(int id) {

        return userRepository.findById(id).orElse(null);
    }
    public User updateUserById(User user) {
        Optional<User> userFound = userRepository.findById(user.getIduser());

        if (userFound.isPresent()) {
            User userUpdate = userFound.get();
            userUpdate.setUser(user.getUser());
            userUpdate.setPassword(user.getPassword());
            return userRepository.save(user);
        } else {
            return null;
        }
    }
    public String deleteUserById(int id) {
        userRepository.deleteById(id);
        return "User "+ id +" deleted";
    }
}
