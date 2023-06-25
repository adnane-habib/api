package com.feedback.api.services;

import com.feedback.api.entity.Feedback;
import com.feedback.api.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private final FeedbackRepository feedbackRepository;
    public FeedbackService(FeedbackRepository feedbackRepository)
    {
        this.feedbackRepository = feedbackRepository;
    }

    public Feedback saveFeedbackWithComments(int q1, int q2, int q3, String comments){
        Feedback feedback = new Feedback(q1, q2, q3, comments);
        Feedback savedFeedback = feedbackRepository.save(feedback);
        return savedFeedback;
    }

    public Feedback saveFeedback(int q1, int q2, int q3){
        Feedback feedback = new Feedback(q1, q2, q3);
        Feedback savedFeedback = feedbackRepository.save(feedback);
        return savedFeedback;
    }
}
