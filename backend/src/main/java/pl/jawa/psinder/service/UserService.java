package pl.jawa.psinder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pl.jawa.psinder.entity.User;
import pl.jawa.psinder.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public User addUser(User user) {
        return userRepository.save(user);
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
//    Commented out this code due to being replaced by save() from JwtAuthenticationController
//    public long getCreationId() {
//        List<User> lastUser = userRepository.findTopByOrderByIdDesc();
//        return lastUser.get(0).getId() + 1;
//    }
}
