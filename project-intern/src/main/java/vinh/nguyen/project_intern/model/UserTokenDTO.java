package vinh.nguyen.project_intern.model;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import vinh.nguyen.project_intern.entity.User;

import java.util.Date;

public class UserTokenDTO {
    private String id;
    private String userID;
    private String token;
    private String refreshToken;
    private String providerId;
    private String provider;
    private Boolean valid;
    private Date createdAt;
    private Date updatedAt;
}
