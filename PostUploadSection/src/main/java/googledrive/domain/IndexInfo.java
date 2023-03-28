package googledrive.domain;

import googledrive.PostUploadSectionApplication;
import googledrive.domain.Indexed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "IndexInfo_table")
@Data
public class IndexInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String indexYn;

    private String fileId;

    private String keyword;

    @PostPersist
    public void onPostPersist() {
        Indexed indexed = new Indexed(this);
        indexed.publishAfterCommit();
    }

    public static IndexInfoRepository repository() {
        IndexInfoRepository indexInfoRepository = PostUploadSectionApplication.applicationContext.getBean(
            IndexInfoRepository.class
        );
        return indexInfoRepository;
    }

    public static void indexing(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        IndexInfo indexInfo = new IndexInfo();
        repository().save(indexInfo);

        Indexed indexed = new Indexed(indexInfo);
        indexed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(indexInfo->{
            
            indexInfo // do something
            repository().save(indexInfo);

            Indexed indexed = new Indexed(indexInfo);
            indexed.publishAfterCommit();

         });
        */

    }
}
