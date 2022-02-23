package de.springdemo.springboot.service;

import java.util.ArrayList;
import java.util.List;

import de.springdemo.springboot.model.StackoverflowWebsite;

import org.springframework.stereotype.Service;

@Service
public class StackoverflowService {
	private static List<StackoverflowWebsite> items = new ArrayList<>();

	static {
		items.add(new StackoverflowWebsite("stackoverflow", "http://stackoverflow.com",
				"http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico", "Stack Overflow",
				"1. for professionals"));
		items.add(new StackoverflowWebsite("serverfault", "http://stackoverflow.com",
				"http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico", "Stack Overflow",
				"2. for professionals"));
		items.add(new StackoverflowWebsite("superuser", "http://stackoverflow.com",
				"http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico", "Stack Overflow",
				"3. for professionals"));

	}

	public List<StackoverflowWebsite> findAll() {
		return items;
	}
}
