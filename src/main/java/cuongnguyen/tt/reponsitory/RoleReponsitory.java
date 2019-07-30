package cuongnguyen.tt.reponsitory;

import cuongnguyen.tt.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleReponsitory extends JpaRepository<RoleEntity, Integer> {
    List<RoleEntity> findAll();
}
