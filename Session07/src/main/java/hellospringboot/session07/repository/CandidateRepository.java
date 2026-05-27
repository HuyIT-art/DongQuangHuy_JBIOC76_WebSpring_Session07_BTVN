package hellospringboot.session07.repository;

import hellospringboot.session07.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository
        extends JpaRepository<Candidate, Integer> {
}