package testab.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import testab.config.kafka.KafkaProcessor;
import testab.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    CoreRepository coreRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Approved' and headers['serviceType']=='model'"
    )
    public void wheneverApproved_StartModel(@Payload Approved approved) {
        Approved event = approved;
        System.out.println(
            "\n\n##### listener StartModel : " + approved + "\n\n"
        );

        // Sample Logic //
        Core.startModel(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Approved' and headers['serviceType']=='target'"
    )
    public void wheneverApproved_StartTarget(@Payload Approved approved) {
        Approved event = approved;
        System.out.println(
            "\n\n##### listener StartTarget : " + approved + "\n\n"
        );

        // Sample Logic //
        Core.startTarget(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='RequestCanceled'"
    )
    public void wheneverRequestCanceled_RequestCanceled(
        @Payload RequestCanceled requestCanceled
    ) {
        RequestCanceled event = requestCanceled;
        System.out.println(
            "\n\n##### listener RequestCanceled : " + requestCanceled + "\n\n"
        );

        // Sample Logic //
        Core.requestCanceled(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
