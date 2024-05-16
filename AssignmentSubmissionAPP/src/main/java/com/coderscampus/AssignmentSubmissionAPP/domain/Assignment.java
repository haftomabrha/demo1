package com.coderscampus.AssignmentSubmissionAPP.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.coderscampus.AssignmentSubmissionAPP.domain.User;


@Entity

public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String status;
    private String githubUrl;
    private String branch;
    private String codeReviewerVideoUrl;

    public void setId(long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setCodeReviewerVideoUrl(String codeReviewerVideoUrl) {
        this.codeReviewerVideoUrl = codeReviewerVideoUrl;
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getBranch() {
        return branch;
    }

    public String getCodeReviewerVideoUrl() {
        return codeReviewerVideoUrl;
    }
}
