package vinh.nguyen.project_intern.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;

import java.util.Date;

@Entity
@Table(name = "company")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company {
    @Id
    @Column(name = "id", length = 64)
    private String id;

    @Column(name = "name", length = 128)
    private String name;

    @Column(name = "name_en", length = 128)
    private String nameEn;

    @Column(name = "code", length = 16)
    private String code;

    @Column(name = "logo", length = 1024)
    private String logo;

    @Column(name = "email", length = 128)
    private String email;

    @Column(name = "phone_number", length = 16)
    private String phoneNumber;

    @Column(name = "website", length = 1024)
    private String website;

    @Column(name = "address", length = 1024)
    private String address;

    @Column(name = "description", length = 1024)
    private String description;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;


}