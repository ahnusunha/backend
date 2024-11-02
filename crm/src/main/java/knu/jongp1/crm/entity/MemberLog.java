package knu.jongp1.crm.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "member_log")
public class MemberLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String gender;
    private int age;
    private LocalDate registerDate;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
}
