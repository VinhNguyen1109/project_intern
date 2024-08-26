package vinh.nguyen.project_intern.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyDTO {
    private String id;

    private String name;

    private String nameEn;

    private String code;

    private String logo;

    private String email;

    private String phoneNumber;

    private String website;

    private String address;

    private String description;

    private Date createdAt;

    private Date updatedAt;
}
