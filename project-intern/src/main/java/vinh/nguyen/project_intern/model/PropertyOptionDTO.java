package vinh.nguyen.project_intern.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vinh.nguyen.project_intern.entity.Property;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyOptionDTO {
    private String id;

    private String label;

    private String value;

    private Property property;

    private Date createdAt;

    private Date updatedAt;
}
