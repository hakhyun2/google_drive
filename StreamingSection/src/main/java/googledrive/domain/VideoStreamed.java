package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String fullFileName;
    private String fileType;
    private String connetUrl;

    public VideoStreamed(StreamInfo aggregate) {
        super(aggregate);
    }

    public VideoStreamed() {
        super();
    }
}
