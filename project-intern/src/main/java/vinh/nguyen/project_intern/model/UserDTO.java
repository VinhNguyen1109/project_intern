package vinh.nguyen.project_intern.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.entity.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String profilePicture;

    private String password;

    private String jobTitle;

    private String bio;

    private String urls;

    private int plan;

    private Date createdAt;

    private Date updateAt;

}
