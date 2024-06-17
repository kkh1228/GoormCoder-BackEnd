package goormcoder.webide.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "t_quest")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quest_num", nullable = false)
    private Long questionNum;

    @Column(name = "quest_title")
    private String questionTitle;

    @Column(name = "quest_content", nullable = false)
    @Lob
    private String content;

    @Column(name = "quest_level")
    private int questionLevel;
}
