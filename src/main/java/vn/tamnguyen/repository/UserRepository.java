package vn.tamnguyen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.tamnguyen.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
