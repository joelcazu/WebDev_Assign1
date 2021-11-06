package assign1.springbootapp.springbootrecipeapp.repository;

import assign1.springbootapp.springbootrecipeapp.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}
