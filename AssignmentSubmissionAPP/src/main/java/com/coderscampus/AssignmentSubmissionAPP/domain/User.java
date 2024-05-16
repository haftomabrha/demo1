package com.coderscampus.AssignmentSubmissionAPP.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate cohortStart;
    private String username;
    private String password;


    public void setId(long id) {
        this.id = id;
    }

    public void setCohortStart(LocalDate cohortStart) {
        this.cohortStart = cohortStart;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public LocalDate getCohortStart() {
        return cohortStart;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
