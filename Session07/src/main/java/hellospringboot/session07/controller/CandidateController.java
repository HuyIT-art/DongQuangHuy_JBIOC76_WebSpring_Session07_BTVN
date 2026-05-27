package hellospringboot.session07.controller;

import hellospringboot.session07.dto.CandidateCreateDTO;
import hellospringboot.session07.dto.CandidateUpdateDTO;
import hellospringboot.session07.entity.Candidate;
import hellospringboot.session07.service.CandidateService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(
            CandidateService candidateService
    ) {
        this.candidateService = candidateService;
    }

    @PostMapping
    public ResponseEntity<Candidate> createCandidate(
            @Valid
            @RequestBody
            CandidateCreateDTO dto
    ) {

        Candidate candidate =
                candidateService.createCandidate(dto);

        return ResponseEntity.ok(candidate);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Candidate>
    updateCandidate(

            @PathVariable Integer id,

            @Valid
            @ModelAttribute
            CandidateUpdateDTO dto
    ) {

        Candidate updatedCandidate =
                candidateService.updateCandidate(id, dto);

        return ResponseEntity.ok(updatedCandidate);
    }
}