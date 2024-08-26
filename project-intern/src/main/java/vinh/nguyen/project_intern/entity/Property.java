package vinh.nguyen.project_intern.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.model.PropertyDTO;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "properties")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Property {
    @Id
    @Column(name = "id", length = 64)
    private String id;
    @Column(name = "name", length = 64, nullable = false)
    private String name;
    @Column(name = "name_en", length = 64)
    private String nameEn;
    @Column(name = "icon", length = 1024, nullable = false)
    private String icon;
    @Column(name = "type", length = 16)
    private String type;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "update_at")
    private Date updateAt;
    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List<PostProperty> postPropertyList;
    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL)
    private List<PropertyOption> propertyOptionList;

    public PropertyDTO toDTO(){
        return PropertyDTO.builder()
                .id(id)
                .name(name)
                .build();
    }

}
