package hellospringboot.session07.service;

import hellospringboot.session07.dto.CandidateCreateDTO;
import hellospringboot.session07.dto.CandidateUpdateDTO;
import hellospringboot.session07.entity.Candidate;

public interface CandidateService {

    Candidate createCandidate(
            CandidateCreateDTO dto
    );
    Candidate updateCandidate(
            Integer id,
            CandidateUpdateDTO dto
    );
}