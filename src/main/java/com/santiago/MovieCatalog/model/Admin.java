package com.santiago.MovieCatalog.model;

import jakarta.persistence.*;

@Entity
@Table (name = "tbl_admins", uniqueConstraints = @UniqueConstraint(columnNames = "adm_name"))
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "adm_name", nullable = false, unique = true)
    private String name;

    @Column (name = "adm_password", nullable = false, unique = true)
    private String password;

    public Admin (){

    }

    public Admin(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Admin( String name, String password) {
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
