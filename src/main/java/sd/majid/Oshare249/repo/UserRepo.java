package sd.majid.Oshare249.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sd.majid.Oshare249.other.User;

public interface UserRepo extends JpaRepository<User, Integer> {
}
