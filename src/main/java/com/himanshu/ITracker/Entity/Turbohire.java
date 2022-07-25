package com.mayank.ITracker.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Turbohire {
      @Id
      @JsonProperty("RecordId")
      private String id;
      @JsonProperty("ApplicantName")
      private String applicant_name;
      @JsonProperty("Category")
      private String category;
      @JsonProperty("JobStage")
      private String job_stage;
      
      
      @JsonProperty("EvaluationDateTime")
      private String evaluation_date_time;
      @JsonProperty("Interviewers")
      private String interviewers;
      

	public Turbohire(String id, String applicant_name, String category, String job_stage, 
			String evaluation_date_time, String interviewers) {
		super();
		this.id = id;
		this.applicant_name = applicant_name;
		this.category = category;
		this.job_stage = job_stage;
		
		this.evaluation_date_time = evaluation_date_time;
		this.interviewers = interviewers;
	}

	public Turbohire() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplicant_name() {
		return applicant_name;
	}

	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getJob_stage() {
		return job_stage;
	}

	public void setJob_stage(String job_stage) {
		this.job_stage = job_stage;
	}



	public String getEvaluation_date_time() {
		return evaluation_date_time;
	}

	public void setEvaluation_date_time(String evaluation_date_time) {
		this.evaluation_date_time = evaluation_date_time;
	}

	public String getInterviewers() {
		return interviewers;
	}

	public void setInterviewers(String interviewers) {
		this.interviewers = interviewers;
	}
      
      

}
