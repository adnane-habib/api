package com.feedback.api.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long Id;

    @Column (name = "Q1_score")
    private Integer q1Score;

    @Column (name = "Q2_score")
    private Integer q2Score;

    @Column (name = "Q3_score")
    private Integer q3Score;

    @Column (name = "comments", nullable = true)
    private String comments;

    public Feedback() {
    }

    public Feedback(Long id, Integer q1Score, Integer q2Score, Integer q3Score, String comments) {
        Id = id;
        this.q1Score = q1Score;
        this.q2Score = q2Score;
        this.q3Score = q3Score;
        this.comments = comments;
    }

    public Feedback(Integer q1Score, Integer q2Score, Integer q3Score, String comments) {
        this.q1Score = q1Score;
        this.q2Score = q2Score;
        this.q3Score = q3Score;
        this.comments = comments;
    }

    public Feedback(Integer q1Score, Integer q2Score, Integer q3Score) {
        this.q1Score = q1Score;
        this.q2Score = q2Score;
        this.q3Score = q3Score;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getQ1Score() {
        return q1Score;
    }

    public void setQ1Score(Integer q1Score) {
        this.q1Score = q1Score;
    }

    public Integer getQ2Score() {
        return q2Score;
    }

    public void setQ2Score(Integer q2Score) {
        this.q2Score = q2Score;
    }

    public Integer getQ3Score() {
        return q3Score;
    }

    public void setQ3Score(Integer q3Score) {
        this.q3Score = q3Score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "Id=" + Id +
                ", q1Score=" + q1Score +
                ", q2Score=" + q2Score +
                ", q3Score=" + q3Score +
                ", comments='" + comments + '\'' +
                '}';
    }
}
