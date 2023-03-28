package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "streamInfos",
    path = "streamInfos"
)
public interface StreamInfoRepository
    extends PagingAndSortingRepository<StreamInfo, Long> {}
