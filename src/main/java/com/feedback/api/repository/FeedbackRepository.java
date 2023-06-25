package com.feedback.api.repository;

import com.feedback.api.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    List<Feedback> findAll();

    Feedback save(Feedback feedback);//Make sure ID is auto increment in DB

}
