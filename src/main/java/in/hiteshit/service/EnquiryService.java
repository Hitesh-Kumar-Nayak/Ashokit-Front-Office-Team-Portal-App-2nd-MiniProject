package in.hiteshit.service;

import java.util.List;

import in.hiteshit.binding.DashboardResponse;
import in.hiteshit.binding.EnquiryForm;
import in.hiteshit.binding.EnquirySearchCriteria;
import in.hiteshit.entity.StudentEnqEntity;

public interface EnquiryService {

	public DashboardResponse getDashboardData(Integer userId);

	public List<String> getCourses();

	public List<String> getEnqStatuses();

	public boolean saveEnquiry(EnquiryForm form);

	public List<StudentEnqEntity> getEnquiries();
	
	public List<StudentEnqEntity> getFilteredEnqs(EnquirySearchCriteria criteria, Integer userId);

}
