package googledrive.infra;

import googledrive.config.kafka.KafkaProcessor;
import googledrive.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class DashBoradViewHandler {

    @Autowired
    private DashBoradRepository dashBoradRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUploaded_then_CREATE_1(
        @Payload FileUploaded fileUploaded
    ) {
        try {
            if (!fileUploaded.validate()) return;

            // view 객체 생성
            DashBorad dashBorad = new DashBorad();
            // view 객체에 이벤트의 Value 를 set 함
            dashBorad.setId(fileUploaded.getId());
            dashBorad.setFileName(fileUploaded.getFullFileName());
            dashBorad.setVideoFileUrl(fileUploaded.getFileUrl());
            dashBorad.setFileType(fileUploaded.getFileType());
            // view 레파지 토리에 save
            dashBoradRepository.save(dashBorad);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenVideoStreamed_then_UPDATE_1(
        @Payload VideoStreamed videoStreamed
    ) {
        try {
            if (!videoStreamed.validate()) return;
            // view 객체 조회
            Optional<DashBorad> dashBoradOptional = dashBoradRepository.findById(
                videoStreamed.getId()
            );

            if (dashBoradOptional.isPresent()) {
                DashBorad dashBorad = dashBoradOptional.get();
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                dashBorad.setUploadYn(Y);
                // view 레파지 토리에 save
                dashBoradRepository.save(dashBorad);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
