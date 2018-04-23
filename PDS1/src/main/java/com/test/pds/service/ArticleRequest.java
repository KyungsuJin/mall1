package com.test.pds.service;

import org.springframework.web.multipart.MultipartFile;

public class ArticleRequest {
	private String articleTitle; // article_title
	private String articleContent; // article_content
	private MultipartFile multipartFile;
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public MultipartFile getMultipartFile() {
		return multipartFile;
	}
	public void setMultipartFile(MultipartFile multipartFile) {
		this.multipartFile = multipartFile;
	}
	@Override
	public String toString() {
		return "ArticleRequest [articleTitle=" + articleTitle + ", articleContent=" + articleContent
				+ ", multipartFile=" + multipartFile + "]";
	}
	
	
}
