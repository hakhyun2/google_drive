package googledrive.domain;

import googledrive.StreamingSectionApplication;
import googledrive.domain.VideoStreamed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "StreamInfo_table")
@Data
public class StreamInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullFileName;

    private String fileType;

    private String connetUrl;

    @PostPersist
    public void onPostPersist() {
        VideoStreamed videoStreamed = new VideoStreamed(this);
        videoStreamed.publishAfterCommit();
    }

    public static StreamInfoRepository repository() {
        StreamInfoRepository streamInfoRepository = StreamingSectionApplication.applicationContext.getBean(
            StreamInfoRepository.class
        );
        return streamInfoRepository;
    }

    public static void streamVideo(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        StreamInfo streamInfo = new StreamInfo();
        repository().save(streamInfo);

        VideoStreamed videoStreamed = new VideoStreamed(streamInfo);
        videoStreamed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(streamInfo->{
            
            streamInfo // do something
            repository().save(streamInfo);

            VideoStreamed videoStreamed = new VideoStreamed(streamInfo);
            videoStreamed.publishAfterCommit();

         });
        */

    }
}
