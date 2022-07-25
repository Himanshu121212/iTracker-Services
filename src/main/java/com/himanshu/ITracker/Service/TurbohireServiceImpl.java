package com.mayank.ITracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.mayank.ITracker.Dao.TurbohireDao;
import com.mayank.ITracker.Entity.Turbohire;
@Service
public class TurbohireServiceImpl implements TurbohireService{
	


	@Autowired
	private TurbohireDao turbohireDao;
	
	private final RestTemplate restTemplate;
	
    public TurbohireServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public ResponseEntity<String> consumeTurboAPI() {
	        HttpHeaders headers=new HttpHeaders();
	        headers.set("X-API-KEY", "1E150160-9BC1-45B8-AC65-30700B8BC8F9");
	        final HttpEntity<String> entity = new HttpEntity<String>(headers);
	        return  restTemplate.exchange("https://api.turbohire.co/api/analytics/evaluations?startDate=2021-11-24&endDate=2021-11-25", HttpMethod.GET, entity, String.class);
	    }

	public List<Turbohire> saveAllInterviewDetails(List<Turbohire> interviewList) {
		return turbohireDao.saveAll(interviewList);
	}

}
