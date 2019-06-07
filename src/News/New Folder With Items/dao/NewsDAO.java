package News.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import News.bo.News;

public interface NewsDAO {
	public static void menu() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}
	public void addNews(Statement st1) ;
	public void deleteNewsByName(Statement st2) ;
	public void findNewsByName(Statement st3) ;
	public List<News> getNews();
	public void updateNewsByName(Statement st5);
}
