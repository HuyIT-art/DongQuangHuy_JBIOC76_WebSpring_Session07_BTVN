package hellospringboot.session07.service;

import hellospringboot.session07.dto.CandidateCreateDTO;
import hellospringboot.session07.entity.Candidate;
import hellospringboot.session07.repository.CandidateRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService {

    private final CandidateRepository
            candidateRepository;

    public CandidateServiceImpl(
            CandidateRepository candidateRepository
    ) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public Candidate createCandidate(
            CandidateCreateDTO dto
    ) {

        Candidate candidate = new Candidate();

        candidate.setFullName(dto.getFullName());
        candidate.setEmail(dto.getEmail());
        candidate.setAge(dto.getAge());
        candidate.setYearsOfExperience(
                dto.getYearsOfExperience()
        );

        return candidateRepository.save(candidate);
    }

}