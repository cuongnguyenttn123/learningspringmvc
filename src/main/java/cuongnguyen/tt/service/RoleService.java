package cuongnguyen.tt.service;

import cuongnguyen.tt.entity.RoleEntity;
import cuongnguyen.tt.reponsitory.RoleReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleReponsitory roleReponsitory;

    public List<RoleEntity> findAll(){
        return roleReponsitory.findAll();
    }
}
