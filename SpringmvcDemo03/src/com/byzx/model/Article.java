package com.byzx.model;

public class Article {
  
	private int id;
	private String name;
	private String content;
	
	
	public Article() {}


	public Article(String name, String content) {
		this.name = name;
		this.content = content;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", content=" + content + "]";
	}
	

	
}
