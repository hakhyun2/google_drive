package googledrive.infra;

import googledrive.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class StreamInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<StreamInfo>> {

    @Override
    public EntityModel<StreamInfo> process(EntityModel<StreamInfo> model) {
        return model;
    }
}
