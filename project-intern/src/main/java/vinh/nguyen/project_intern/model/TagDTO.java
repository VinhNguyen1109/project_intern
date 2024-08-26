package vinh.nguyen.project_intern.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TagDTO {
    private String id;

    private String name;

    private String nameEn;

    private int status;

    private Date createdAt;

    private Date updatedAt;

}
