package testab.domain;

import java.util.*;
import lombok.*;
import testab.domain.*;
import testab.infra.AbstractEvent;

@Data
@ToString
public class Approved extends AbstractEvent {

    private Long id;
    private String state;
    private String userId;
    private String modelName;
}
