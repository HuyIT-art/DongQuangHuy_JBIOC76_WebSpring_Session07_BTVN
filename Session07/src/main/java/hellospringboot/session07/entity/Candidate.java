package hellospringboot.session07.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "full_name")
    private String fullName;

    private String email;

    private Integer age;

    @Column(name = "years_of_experience")
    private Integer yearsOfExperience;

    @Column(name = "address")
    private String address;

    @Column(name = "bio")
    private String bio;

    public Candidate() {
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getAddress() {
        return address;
    }

    public String getBio() {
        return bio;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setYearsOfExperience(
            Integer yearsOfExperience
    ) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}