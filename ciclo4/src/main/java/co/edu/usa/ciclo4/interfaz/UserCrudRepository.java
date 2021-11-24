package co.edu.usa.ciclo4.interfaz;

import co.edu.usa.ciclo4.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author jorge
 */
public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
