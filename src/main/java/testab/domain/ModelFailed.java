package testab.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import testab.domain.*;
import testab.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ModelFailed extends AbstractEvent {

    private Long id;
    private String type;
    private String state;
    private String requestId;

    public ModelFailed(Core aggregate) {
        super(aggregate);
    }

    public ModelFailed() {
        super();
    }
}
//>>> DDD / Domain Event
