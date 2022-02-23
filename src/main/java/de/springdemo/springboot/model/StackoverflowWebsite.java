package de.springdemo.springboot.model;

public class StackoverflowWebsite {
	private final String id;
	private final String website;
	private final String iconImageUrl;
	private final String title;
	private final String description;

	String getId() {
		return id;
	}

	String getWebsite() {
		return website;
	}

	String getIconImageUrl() {
		return iconImageUrl;
	}

	String getTitle() {
		return title;
	}

	String getDescription() {
		return description;
	}

	StackoverflowWebsite(String id, String website, String iconImageUrl, String title, String description) {
		this.id = id;
		this.website = website;
		this.iconImageUrl = iconImageUrl;
		this.title = title;
		this.description = description;
	}
}
