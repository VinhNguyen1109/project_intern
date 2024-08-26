package vinh.nguyen.project_intern.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.entity.Investor;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ArticleDTO {

    private String id;

    private String slug;

    private String title;

    private String subTitle;

    private String content;

    private int featured;

    private String userId;

    private String topic;

    private String moreLinks;

    private String projectId;

    private String investorId;

    private Date visibleFrom;

    private Date visibleTo;

    private int numOfView;

    private int numOfShare;

    private int numOfLike;

    private Double rankingPoint;

    private Date createdAt;

    private Date updatedAt;
}
