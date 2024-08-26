package vinh.nguyen.project_intern.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.entity.Investor;
import vinh.nguyen.project_intern.entity.Post;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PriceHistoryDTO {
    private String id;

    private String priceRange;

    private String priceType;

    private String postId;

    private String investorId;

    private Date createdAt;

    private Date updatedAt;
}
