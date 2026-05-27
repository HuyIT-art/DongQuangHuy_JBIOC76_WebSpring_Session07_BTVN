package hellospringboot.session07.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CandidateUpdateDTO {

    @NotBlank(message = "Address cannot be blank")
    private String address;

    @Size(
            max = 200,
            message = "Bio must not exceed 200 characters"
    )
    private String bio;

    public CandidateUpdateDTO() {
    }

    public String getAddress() {
        return address;
    }

    public String getBio() {
        return bio;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}