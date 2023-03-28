package googledrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DashBorad_table")
@Data
public class DashBorad {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String fileName;
    private Long fileSize;
    private String fileType;
    private Boolean indexYn;
    private Boolean uploadYn;
    private String videoFileUrl;
}
