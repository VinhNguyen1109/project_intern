package vinh.nguyen.project_intern.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "organization")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Organization {
    @Id
    @Column(name = "id", length = 64)
    private String id;

    @Column(name = "name", length = 256)
    private String name;
}
