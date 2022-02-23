package de.springdemo.springboot.web;

import java.util.List;

import de.springdemo.springboot.model.StackoverflowWebsite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stackoverflow")
public class StackoverflowController {
	@Autowired
	private StackoverflowService stackoverflowService;

	@RequestMapping
	public List<StackoverflowWebsite> getListOfProviders() {
		return stackoverflowService.findAll();
	}
}
