package vinh.nguyen.project_intern.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import vinh.nguyen.project_intern.model.AreaDTO;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "area")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Area {
    @Id
    @Column(name = "code", length = 16)
    private String code;
    @Column(name = "name", nullable = false, length = 128)
    private String name;
    @Column(name = "name_en", nullable = false, length = 128)
    private String nameEn;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_code")
    private Area parentArea;
    @OneToMany(mappedBy = "parentArea")
    private List<Area> childrenAreaList;
    @Column(name = "level", length = 16)
    private String level;
    @Column(name = "level_detail", length = 64)
    private String levelDetail;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "update_at")
    private Date updatedAt;

    public AreaDTO toDTO(){
        return AreaDTO.builder()
                .code(code)
                .name(name)
                .nameEn(nameEn)
                .parentCode(parentArea.code)
                .level(level)
                .levelDetail(levelDetail)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .build();
    }

}
