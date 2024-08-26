package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.model.ArticleDTO;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {
    @Id
    @Column(name = "id", length = 64)
    private String id;

    @Column(name = "slug", length = 256, nullable = false)
    private String slug;

    @Column(name = "title", length = 1024, nullable = false)
    private String title;

    @Column(name = "sub_title", length = 1024)
    private String subTitle;

    @Column(name = "content")
    private String content;

    @Column(name = "featured")
    private int featured;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    @Column(name = "topic", length = 256)
    private String topic;

    @Column(name = "more_links")
    private String moreLinks;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "investor_id")
    private Investor investor;

    @Column(name = "visible_from")
    private Date visibleFrom;

    @Column(name = "visible_to")
    private Date visibleTo;

    @Column(name = "num_of_view")
    private int numOfView;

    @Column(name = "num_of_share")
    private int numOfShare;

    @Column(name = "num_of_like")
    private int numOfLike;

    @Column(name = "ranking_point")
    private Double rankingPoint;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @OneToMany(mappedBy = "article", cascade = CascadeType.ALL)
    private List<UserLikeArticle> userLikeArticleList;

    public ArticleDTO toDTO(){
        return ArticleDTO.builder()
                .id(id)
                .slug(slug)
                .title(title)
                .subTitle(subTitle)
                .content(content)
                .featured(featured)
                .userId(user.getId())
                .topic(topic)
                .moreLinks(moreLinks)
                .projectId(project.getId())
                .investorId(investor.getId())
                .visibleFrom(visibleFrom)
                .visibleTo(visibleTo)
                .numOfLike(numOfLike)
                .numOfShare(numOfShare)
                .numOfView(numOfView)
                .rankingPoint(rankingPoint)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .build();
    }
}
