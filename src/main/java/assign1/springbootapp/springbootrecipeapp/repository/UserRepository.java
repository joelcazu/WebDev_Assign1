package assign1.springbootapp.springbootrecipeapp.repository;

import assign1.springbootapp.springbootrecipeapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    User findByUsername(String username);
}