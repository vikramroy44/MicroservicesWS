package com.vikram.student.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vikram.student.entity.response.Subject;

@FeignClient(url = "http://localhost:7071", value = "SubjectSerevice")
public interface SubjectClient {
	
  @GetMapping("/subject/std/{stdid}")
  Subject subjByStdId(@PathVariable int stdid);

}
