package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class IndexInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<IndexInfo>> {

    @Override
    public EntityModel<IndexInfo> process(EntityModel<IndexInfo> model) {
        return model;
    }
}
