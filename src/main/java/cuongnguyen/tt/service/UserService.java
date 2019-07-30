package cuongnguyen.tt.service;

import cuongnguyen.tt.entity.UserEntity;
import cuongnguyen.tt.reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserReponsitory userReponsitory;
    public List<UserEntity> findAll(){
        return userReponsitory.findAll();
    }
}
