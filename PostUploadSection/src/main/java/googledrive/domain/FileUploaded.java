package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String uploadYmd;
    private String fullFileName;
    private String fileUrl;
    private String fileType;
    private String userId;
}
