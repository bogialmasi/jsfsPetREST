package hu.petREST.repo;

import hu.petREST.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ORepository extends JpaRepository<Owner, Integer> {
}
