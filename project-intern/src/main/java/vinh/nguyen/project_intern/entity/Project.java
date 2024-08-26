package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "project")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Project {
    @Id
    @Column(name = "id", length = 64)
    private String id;
    @Column(name = "name", nullable = false, length = 256)
    private String name;
    @Column(name = "name_en", nullable = false, length = 256)
    private String nameEn;
    @Column(name = "images")
    private String images;
    @Column(name = "banner", nullable = false, length = 1024)
    private String banner;
    @Column(name = "address", nullable = false, length = 1024)
    private String address;

    @ManyToOne
    @JoinColumn(name = "ward_code")
    private Area ward;

    @ManyToOne
    @JoinColumn(name = "district_code")
    private Area district;

    @ManyToOne
    @JoinColumn(name = "province_code")
    private Area province;

    @Column(name = "description")
    private String description;

    @Column(name = "num_apartment")
    private int numApartment;

    @Column(name = "num_building")
    private int numBuilding;

    @Column(name = "construction_area")
    private Double constructionArea;

    @Column(name = "construction_site", length = 1024)
    private String constructionSite;

    @Column(name = "status", length = 64)
    private String status;

    @ManyToOne
    @JoinColumn(name = "investor_id")
    private Investor investor;

    @Column(name = "verified")
    private int verified;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Post> postList;
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Article> articles;


}
