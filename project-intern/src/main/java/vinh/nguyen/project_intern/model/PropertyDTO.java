package vinh.nguyen.project_intern.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyDTO {
    private String id;

    private String name;

    private String nameEn;

    private String icon;

    private String type;

    private Date createdAt;

    private Date updateAt;
}
