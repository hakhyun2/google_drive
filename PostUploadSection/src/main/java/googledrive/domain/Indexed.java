package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private String indexYn;
    private String fileId;
    private String keyword;

    public Indexed(IndexInfo aggregate) {
        super(aggregate);
    }

    public Indexed() {
        super();
    }
}
