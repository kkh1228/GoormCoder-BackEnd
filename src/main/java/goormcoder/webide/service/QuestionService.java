package goormcoder.webide.service;

import goormcoder.webide.common.dto.ErrorMessage;
import goormcoder.webide.domain.Question;
import goormcoder.webide.dto.request.QuestionCreateDto;
import goormcoder.webide.repository.QuestionRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    @Transactional
    public Question create(QuestionCreateDto createDto) {
        Question question = new Question(
                createDto.title(),
                createDto.level(),
                createDto.content()
        );
        questionRepository.save(question);
        return question;
    }

    public Question findById(Long id) {
        return questionRepository.findById(id)
                .filter(Question::isActive)
                .orElseThrow(() -> new EntityNotFoundException(ErrorMessage.QUESTION_NOT_FOUND.getMessage()));
    }

    public Question update(Long id, int level, String title, String content) {
        Question question = this.findById(id);
        question.update(title, level, content);
        questionRepository.save(question);
        return question;
    }

    public void delete(Long id) {
        Question question = this.findById(id);
        question.markAsDeleted();
        questionRepository.save(question);
    }

}