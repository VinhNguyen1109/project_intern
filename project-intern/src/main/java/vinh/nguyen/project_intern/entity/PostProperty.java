package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.model.PostDTO;
import vinh.nguyen.project_intern.model.PostPropertyDTO;

import java.util.Date;

@Entity
@Table(name = "post_properties")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostProperty {
    @Id
    @Column(name = "id", length = 64)
    private String id;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;
    @ManyToOne
    @JoinColumn(name = "properties_id")
    private Property property;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    public PostPropertyDTO toDTO(){
        return PostPropertyDTO.builder()
                .id(id)
                .postID(post.getId())
                .propertyId(property.getId())
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .createdBy(createdBy)
                .updatedBy(updatedBy)
                .build();
    }
}
