package googledrive.infra;

import googledrive.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "dashBorads",
    path = "dashBorads"
)
public interface DashBoradRepository
    extends PagingAndSortingRepository<DashBorad, Long> {}
