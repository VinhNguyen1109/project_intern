package vinh.nguyen.project_intern.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.entity.Post;
import vinh.nguyen.project_intern.entity.Tag;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PostTagDTO {

    private String id;

    private String tagId;

    private String postId;

    private Date createdAt;

    private Date updatedAt;
}
