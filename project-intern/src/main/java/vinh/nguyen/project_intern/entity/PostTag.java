package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.model.PostTagDTO;

import java.util.Date;

@Entity
@Table(name = "post_tag")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PostTag {
    @Id
    @Column(name = "id", length = 64)
    private String id;
    @ManyToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    public PostTagDTO toDTO(){
        return PostTagDTO.builder()
                .id(id)
                .tagId(tag.getId())
                .postId(post.getId())
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .build();
    }
}
