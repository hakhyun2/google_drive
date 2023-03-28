package googledrive.domain;

import googledrive.UploadSectionCoreApplication;
import googledrive.domain.FileUploaded;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String uploadYmd;

    private String fullFileName;

    private String fileUrl;

    private String fileType;

    private Long fileSize;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static FileRepository repository() {
        FileRepository fileRepository = UploadSectionCoreApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }
}
