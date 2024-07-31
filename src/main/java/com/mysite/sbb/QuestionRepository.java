package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Question 엔티티로 레포지토리 생성, 기본키가 Integer임을 지정
public interface QuestionRepository extends JpaRepository<Question, Integer> {
  Question findBySubject(String subject);
  Question findBySubjectAndContent(String subject, String content);
  List<Question> findBySubjectLike(String subject);
}
