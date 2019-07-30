package cuongnguyen.tt.reponsitory;

import cuongnguyen.tt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserReponsitory extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> findAllBy();
    UserEntity findByUserName(String username);
}
