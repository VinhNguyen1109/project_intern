package vinh.nguyen.project_intern.model;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.entity.Post;
import vinh.nguyen.project_intern.entity.Property;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostPropertyDTO {
    private String id;

    private String postID;

    private String propertyId;

    private String createdBy;

    private String updatedBy;

    private Date createdAt;

    private Date updatedAt;
}
