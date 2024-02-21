package testab.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import testab.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "cores", path = "cores")
public interface CoreRepository
    extends PagingAndSortingRepository<Core, Long> {
        List<Core> findByState(String state);
    }
