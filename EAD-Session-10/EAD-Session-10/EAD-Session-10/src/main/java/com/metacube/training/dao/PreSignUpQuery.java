package com.metacube.training.dao;

public interface PreSignUpQuery {

	String INSERT_EMPLOYEE = "INSERT INTO Employee (emp_code, first_name, middle_name, last_name, dob,"
			+ " gender, email_id, password)"
			+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	
	String INSERT_JOB_DETAIL = "INSERT INTO JobDetails (emp_code, date_of_joining, total_exp,"
			+ " job_code, reporting_mgr, team_lead, curr_project_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
}
