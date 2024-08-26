package vinh.nguyen.project_intern.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLikeArticleDTO {
    private String id;

    private String type;

    private String userId;

    private String articleId;

    private Date createdAt;

    private Date updatedAt;
}
