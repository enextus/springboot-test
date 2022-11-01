package de.springdemo.springboot.web;

import java.util.List;

import de.springdemo.springboot.model.StackoverflowWebsite;
import de.springdemo.springboot.service.StackoverflowService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stackoverflow")
public class StackoverflowController {
	private final StackoverflowService stackoverflowService;

	public StackoverflowController(StackoverflowService stackoverflowService) {
		this.stackoverflowService = stackoverflowService;
	}

	@RequestMapping
	public List<StackoverflowWebsite> getListOfProviders() {
		return stackoverflowService.findAll();
	}
}
