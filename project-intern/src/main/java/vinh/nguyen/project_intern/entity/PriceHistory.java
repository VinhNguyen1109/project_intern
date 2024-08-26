package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.model.PriceHistoryDTO;

import java.util.Date;

@Entity
@Table(name = "price_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PriceHistory {

    @Id
    @Column(name = "id", length = 64)
    private String id;

    @Column(name = "price_range", length = 128)
    private String priceRange;

    @Column(name = "price_type", length = 64)
    private String priceType;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "investor_id")
    private Investor investor;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public PriceHistoryDTO toDTO(){
        return PriceHistoryDTO.builder()
                .id(id)
                .priceRange(priceRange)
                .priceType(priceType)
                .postId(post.getId())
                .build();
    }

}
