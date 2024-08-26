package vinh.nguyen.project_intern.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "user_token")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserToken {
    @Id
    @Column(name = "id", length = 64)
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "token")
    private String token;
    @Column(name = "refresh_token", length = 128)
    private  String refreshToken;
    @Column(name = "provider_id", length = 16)
    private String providerId;
    @Column(name = "provider", length = 16)
    private String provider;
    @Column(name = "valid")
    private Boolean valid;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;



}
