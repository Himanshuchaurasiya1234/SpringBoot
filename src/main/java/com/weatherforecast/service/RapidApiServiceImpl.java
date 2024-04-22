package com.weatherforecast.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class RapidApiServiceImpl implements RapidApiService {
	
	
	@Autowired
	private RestTemplate restTemplate;



	@Override
	public ResponseEntity<String> RapidApiGetForecastSummaryByLocationName(String name) {
		String baseurl = "https://forecast9.p.rapidapi.com/rapidapi/forecast/{name}/summary/";
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Host", "forecast9.p.rapidapi.com");
		headers.set("X-RapidAPI-Key", "eb1fab039cmshe5bbf999bc4caf0p135a40jsnc12bcb123bd7");
		headers.set("X-API-Key", "SecureApiKey@123");

		Map<String, String> urlParams = new HashMap<>();
		urlParams.put("name", name);
		HttpEntity<?> entity = new HttpEntity<>(headers);

		
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseurl);

		System.out.println(builder.buildAndExpand(urlParams).toUri());


		return restTemplate.exchange(builder.buildAndExpand(urlParams).toUri(), HttpMethod.GET, entity, String.class);
	}

	@Override
	public ResponseEntity<String> RapidApiGetHourlyForecastByLocationName(String name) {
		String baseurl = "https://forecast9.p.rapidapi.com/rapidapi/forecast/{name}/hourly/";
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Host", "forecast9.p.rapidapi.com");
		headers.set("X-RapidAPI-Key", "eb1fab039cmshe5bbf999bc4caf0p135a40jsnc12bcb123bd7");
 headers.set("X-API-Key", "SecureApiKey@123");

		Map<String, String> urlParams = new HashMap<>();
		urlParams.put("name", name);
		HttpEntity<?> entity = new HttpEntity<>(headers);

		
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(baseurl);

		System.out.println(builder.buildAndExpand(urlParams).toUri());

		

		return restTemplate.exchange(builder.buildAndExpand(urlParams).toUri(), HttpMethod.GET, entity, String.class);
		
	}
	
	
	


}
