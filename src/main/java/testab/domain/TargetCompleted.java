package testab.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import testab.domain.*;
import testab.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class TargetCompleted extends AbstractEvent {

    private Long id;
    private String type;
    private String state;
    private String requestId;

    public TargetCompleted(Core aggregate) {
        super(aggregate);
    }

    public TargetCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
