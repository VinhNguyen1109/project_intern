package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.model.PostDTO;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "post")
public class Post {
    @Id
    @Column(name = "id", length = 64)
    private String id;
    @Column(name = "title", length = 1024, nullable = false)
    private String title;

    @Column(name = "sub_title", length = 1024)
    private String subTitle;

    @Column(name = "description")
    private String description;

    @Column(name = "address", length = 1024)
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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "phone_number", length = 16)
    private String phoneNumber;
    @Column(name = "zalo", length = 64)
    private String zalo;
    @Column(name = "email", length = 64)
    private String email;

    @Column(name = "type", length = 32)
    private String type;

    @Column(name = "estate_type", length = 64)
    private String estateType;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "from_price", nullable = false)
    private int fromPrice;

    @Column(name = "to_price", nullable = false)
    private int toPrice;

    @Column(name = "price_type", length = 8)
    private String priceType;

    @Column(name = "construction_area")
    private String constructionArea;

    @Column(name = "num_bedrooms")
    private int numBedrooms;

    @Column(name = "num_toilets")
    private int numToilets;

    @Column(name = "num_floors")
    private int numFloors;

    @Column(name = "images")
    private String images;

    @Column(name = "videos")
    private String videos;

    @Column(name = "status", length = 32)
    private String status;

    @Column(name = "positions", length = 32)
    private String positions;

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

    @Column(name = "num_of_click_contact")
    private int numOfClickContact;

    @Column(name = "verified")
    private int verified;

    @Column(name = "ranking_point")
    private Double rankingPoint;

    @Column(name = "created_by", length = 64)
    private String createdBy;
    @Column(name = "updated_by", length = 64)
    private String updatedBy;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PostProperty> postPropertyList;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<UserClickContact> userClickContactList;


    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<PriceHistory> priceHistoryList;


    public PostDTO toDTO(){
        return PostDTO.builder()
                .id(id)
                .title(title)
                .subTitle(subTitle)
                .description(description)
                .address(address)
                .wardId(ward.getCode())
                .districtId(district.getCode())
                .projectId(province.getCode())
                .userId(user.getId())
                .phoneNumber(phoneNumber)
                .zalo(zalo)
                .email(email)
                .type(type)
                .estateType(estateType)
                .provinceId(province.getCode())
                .fromPrice(fromPrice)
                .toPrice(toPrice)
                .priceType(priceType)
                .constructionArea(constructionArea)
                .numBedrooms(numBedrooms)
                .numToilets(numToilets)
                .numFloors(numFloors)
                .images(images)
                .videos(videos)
                .status(status)
                .positions(positions)
                .visibleFrom(visibleFrom)
                .visibleTo(visibleTo)
                .numOfView(numOfView)
                .numOfLike(numOfLike)
                .numOfClickContact(numOfClickContact)
                .verified(verified)
                .rankingPoint(rankingPoint)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .createdBy(createdBy)
                .updatedBy(updatedBy)
                .build();
    }
}
