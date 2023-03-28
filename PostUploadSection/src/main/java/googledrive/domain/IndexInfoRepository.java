package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "indexInfos",
    path = "indexInfos"
)
public interface IndexInfoRepository
    extends PagingAndSortingRepository<IndexInfo, Long> {}
