package assign1.springbootapp.springbootrecipeapp.services;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;
import assign1.springbootapp.springbootrecipeapp.dto.UserRegistrationDto;
import assign1.springbootapp.springbootrecipeapp.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
    List<User> getAll();
}
