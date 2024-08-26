package vinh.nguyen.project_intern.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProjectDTO {
    private String id;

    private String name;

    private String nameEn;

    private String images;

    private String banner;

    private String address;

    private String wardId;

    private String districtId;

    private String provinceId;

    private String description;

    private int numApartment;

    private int numBuilding;

    private Double constructionArea;

    private String constructionSite;

    private String status;

    private String investorId;

    private int verified;

    private Date createdAt;

    private Date updatedAt;

}
