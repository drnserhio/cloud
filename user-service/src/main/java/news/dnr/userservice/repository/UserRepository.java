package news.dnr.userservice.repository;

import news.dnr.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @Description: UserRepository
 * @Author: Serhio Duran
 * @create: 2024-10-04-15:06
 **/

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
