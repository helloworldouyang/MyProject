package com.wechatpublic.message.resp;

import java.util.List;

/**
 * ��Ӧ��Ϣ֮ͼ����Ϣ
 * @author Administrator
 *
 */
public class NewsMessage extends BaseMessage{

	// ͼ����Ϣ��������Ϊ10������  
    private int ArticleCount;  
    // ����ͼ����Ϣ��Ϣ��Ĭ�ϵ�һ��itemΪ��ͼ  
    private List<Article> Articles;
	public int getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}
	public List<Article> getArticles() {
		return Articles;
	}
	public void setArticles(List<Article> articles) {
		Articles = articles;
	}  
    
    
}
