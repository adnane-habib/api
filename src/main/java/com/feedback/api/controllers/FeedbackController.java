package com.feedback.api.controllers;

import com.feedback.api.entity.Feedback;
import com.feedback.api.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeedbackController {

    @Autowired
    private final FeedbackService feedbackService;

    public FeedbackController (FeedbackService feedbackService){
        this.feedbackService = feedbackService;
    }

    @PostMapping(value = "/api/submit-feedback/v1")

    public @ResponseBody Feedback feedbackApiEdit(@RequestParam int q1, int q2, int q3, String comment, Model model) {


        Feedback savedFeedback =  feedbackService.saveFeedbackWithComments(q1, q2, q3, comment);
        System.out.println("I have saved feedback data with API, I am leaving the controller");
        System.out.println(savedFeedback.toString());
        model.addAttribute("feedback", savedFeedback);
        return savedFeedback;
/*        if (savedFeedback != null){
            return "confirmation-page";
        } else {
            return "error";}*/
    }

    @PostMapping(value = "/submit-feedback")

    public String feedbackEdit(@RequestParam int q1, int q2, int q3, String comment, Model model) {


        Feedback savedFeedback =  feedbackService.saveFeedbackWithComments(q1, q2, q3, comment);
        System.out.println("I have saved feedback data, I am leaving the controller");
        System.out.println(savedFeedback.toString());
        model.addAttribute("feedback", savedFeedback);

        if (savedFeedback != null){
            return "/WEB-INF/views/confirmation-page.jsp";
        } else {
            return "error.html";}
    }

}