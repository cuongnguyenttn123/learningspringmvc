package cuongnguyen.tt.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role")
    private String role;

    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "roleEntitySet",cascade = {CascadeType.ALL})
    @JsonManagedReference
    Set<UserEntity> userEntitySet;

    public RoleEntity() {
    }

    public RoleEntity(String role, Set<UserEntity> userEntitySet) {
        this.role = role;
        this.userEntitySet = userEntitySet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
