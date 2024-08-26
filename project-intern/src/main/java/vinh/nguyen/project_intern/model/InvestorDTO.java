package vinh.nguyen.project_intern.model;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.entity.Area;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvestorDTO {
    private String id;

    private String name;

    private String nameEn;

    private String logo;

    private String banner;

    private String description;

    private Date founding;

    private int numProject;

    private String phoneNumber;

    private String email;

    private String website;

    private String address;

    private String wardId;

    private String districtId;

    private String provinceId;

    private String mainBusinessArea;

    private int verified;

    private String status;

    private Date createdAt;

    private Date updatedAt;
}

