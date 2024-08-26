package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "properties_options")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyOption {
    @Id
    @Column(name = "id", length = 64)
    private String id;
    @Column(name = "label", length = 256)
    private String label;
    @Column(name = "value", length = 256)
    private String value;
    @ManyToOne
    @JoinColumn(name = "properties_id")
    private Property property;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
}
