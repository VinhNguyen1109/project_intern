package vinh.nguyen.project_intern.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.entity.Area;
import vinh.nguyen.project_intern.entity.Project;
import vinh.nguyen.project_intern.entity.User;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDTO {
    private String id;

    private String title;

    private String subTitle;

    private String description;

    private String address;

    private String wardId;

    private String districtId;

    private String provinceId;

    private String userId;

    private String phoneNumber;

    private String zalo;

    private String email;

    private String type;

    private String estateType;

    private String projectId;

    private int fromPrice;

    private int toPrice;

    private String constructionArea;

    private int numBedrooms;

    private int numToilets;

    private int numFloors;

    private String images;

    private String videos;

    private String status;

    private String positions;

    private Date visibleFrom;

    private Date visibleTo;

    private int numOfView;

    private int numOfShare;

    private int numOfLike;

    private int numOfClickContact;

    private int verified;

    private Double rankingPoint;

    private String createdBy;

    private String updatedBy;

    private Date createdAt;

    private Date updatedAt;
    private String priceType;
}
