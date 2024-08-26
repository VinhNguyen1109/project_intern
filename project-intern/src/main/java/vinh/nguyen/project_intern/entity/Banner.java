package vinh.nguyen.project_intern.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.XSlf4j;

import java.util.Date;

@Entity
@Table(name = "banner")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Banner {
    @Id
    @Column(name = "id", length = 64)
    private String id;

    @Column(name = "name", length = 256)
    private String name;

    @Column(name = "banner", length = 1024, nullable = false)
    private String banner;

    @Column(name = "link", length = 1024, nullable = false)
    private String link;

    @Column(name = "status")
    private int status;

    @Column(name = "type", length = 32)
    private String type;

    @Column(name = "visible_from")
    private Date visibleFrom;

    @Column(name = "visible_to")
    private Date visibleTo;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;


}
