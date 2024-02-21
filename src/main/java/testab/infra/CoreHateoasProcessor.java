package testab.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import testab.domain.*;

@Component
public class CoreHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Core>> {

    @Override
    public EntityModel<Core> process(EntityModel<Core> model) {
        return model;
    }
}
