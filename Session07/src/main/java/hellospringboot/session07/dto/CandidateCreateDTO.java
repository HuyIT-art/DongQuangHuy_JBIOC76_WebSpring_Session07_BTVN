package hellospringboot.session07.dto;

import jakarta.validation.constraints.*;

public class CandidateCreateDTO {
    @NotBlank(message = "Phone is required")
    @Pattern(
            regexp = "^(03|05|07|08|09)\\d{8}$",
            message = "Số điện thoại không hợp lệ"
    )
    private String phone;

    @NotBlank(message = "Full name is required")
    @Size(min = 5, max = 50,
            message = "Full name must be 5-50 characters")
    private String fullName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @Min(value = 18,
            message = "Candidate must be at least 18")
    private Integer age;

    @Min(value = 0,
            message = "Years of experience cannot be negative")
    private Integer yearsOfExperience;

    public CandidateCreateDTO() {
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
}