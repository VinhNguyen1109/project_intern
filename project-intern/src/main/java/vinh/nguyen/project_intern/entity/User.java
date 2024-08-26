package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "first_name", length = 64, nullable = true)
    private String firstName;

    @Column(name = "last_name", length = 64, nullable = true)
    private String lastName;

    @Column(name = "email", length = 256, nullable = false)
    private String email;

    @Column(name = "username", length = 64, nullable = false)
    private String username;

    @Column(name = "profile_picture", length = 256)
    private String profilePicture;

    @Column(name = "password", length = 256)
    private String password;

    @Column(name = "job_title", length = 256)
    private String jobTitle;

    @Column(name = "bio", length = 256)
    private String bio;

    @Column(name = "urls", length = 1024)
    private String urls;

    @Column(name = "plan", columnDefinition = "tinyint")
    private int plan;

    @Column(name = "create_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updateAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserToken> userTokenList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> postList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Article> articleList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserLikeArticle> userLikeArticleList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserClickContact> userClickContacts;
}
