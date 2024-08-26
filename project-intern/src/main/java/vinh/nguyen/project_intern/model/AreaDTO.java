package vinh.nguyen.project_intern.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AreaDTO {
    private String code;
    private String name;
    private String nameEn;
    private String parentCode;
    private String level;
    private String levelDetail;
    private Date createdAt;
    private Date updatedAt;
}
