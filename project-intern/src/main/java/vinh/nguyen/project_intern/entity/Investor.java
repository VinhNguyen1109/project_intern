package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import vinh.nguyen.project_intern.model.InvestorDTO;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "investor")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Investor {
    @Id
    @Column(name = "id", length = 64)
    private String id;
    @Column(name = "name", length = 128, nullable = false)
    private String name;
    @Column(name = "name_en", length = 128)
    private String nameEn;
    @Column(name = "logo", length = 1024, nullable = false)
    private String logo;
    @Column(name = "banner", length = 1024)
    private String banner;

    @Column(name = "description", length = 1024)
    private String description;
    @Column(name = "founding")
    private Date founding;
    @Column(name = "num_project")
    private int numProject;

    @Column(name = "phone_number", length = 16)
    private String phoneNumber;
    @Column(name = "email", length = 64)
    private String email;
    @Column(name = "website", length = 1024)
    private String website;
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

    @Column(name = "main_business_area", length = 256)
    private String mainBusinessArea;

    @Column(name = "verified")
    private int verified;

    @Column(name = "status", length = 16)
    private String status;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL)
    private List<Project> projectList;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL)
    private List<Article> articleList;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL)
    private List<PriceHistory> priceHistoryList;

    public InvestorDTO toDTO(){
        return InvestorDTO.builder()
                .id(id)
                .name(name)
                .nameEn(nameEn)
                .logo(logo)
                .banner(banner)
                .description(description)
                .founding(founding)
                .numProject(numProject)
                .phoneNumber(phoneNumber)
                .email(email)
                .website(website)
                .address(address)
                .wardId(ward.getCode())
                .provinceId(province.getCode())
                .districtId(district.getCode())
                .mainBusinessArea(mainBusinessArea)
                .verified(verified)
                .status(status)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .build();
    }
}
