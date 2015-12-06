package db.mapping;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Dmitriy on 22.11.2015.
 * Project TestWebApp.
 */
@Entity
@Table(name = "roles", schema = "test_app")
public class RolesEntity {
    private int idRec;
    private String name;
    private String description;
    private Set<UserEntity> user;

    @Id
    @Column(name = "id_rec")
    public int getIdRec() {
        return idRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToMany(mappedBy = "userRole")
    public Set<UserEntity> getUser() {
        return this.user;
    }

    public void setUser(Set<UserEntity> user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolesEntity that = (RolesEntity) o;

        if (idRec != that.idRec) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRec;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
