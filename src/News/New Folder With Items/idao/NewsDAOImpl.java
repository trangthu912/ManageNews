package News.idao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import News.bo.News;
import News.dao.NewsDAO;
import News.utils.*;
public class NewsDAOImpl implements NewsDAO {
//id,category_id,name,description,detail,image,date,user_id	
//	ArrayList<News> news = new ArrayList<News>();
	public static Scanner scanner = new Scanner(System.in);
	
	@Override
	public void addNews(Statement st1)  {
		// TODO Auto-generated method stub
		System.out.println("id:");
		int id = scanner.nextInt();
		System.out.println("category_id:");
		int category_id = scanner.nextInt();
		System.out.println("name:");
		String name = scanner.nextLine();
		System.out.println("description:");
		String description = scanner.nextLine();
		System.out.println("detail:");
		String detail = scanner.nextLine();
		System.out.println("image:");
		String image = scanner.nextLine();
		System.out.println("date:");
		String date = scanner.nextLine();
		System.out.println("user_id:");
		int user_id = scanner.nextInt();
//		News new1 = new News(id,category_id,name,description,detail,image,date,user_id);
//		news.add(new1);
		
		try {
//			Connection conn = ConnectionUtils.getMyConnection() ;
			String sql = ("INSERT INTO news (id,category_id,name,description,detail,image,date,user_id) VALUES ("+id+","+category_id+","+name+","+description+","+detail+","+image+","+date+","+user_id+");");
//			Statement statement = conn.createStatement();
			st1.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteNewsByName(Statement st2) {
		// TODO Auto-generated method stub
		System.out.println("name:");
		String name = scanner.nextLine();
		try {
			String sql = "delete from news where name = "+ name +";";
			st2.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	@Override
	public void findNewsByName(Statement st3)  {
		// TODO Auto-generated method stub
		System.out.println("name:");
		String name = scanner.nextLine();
//		Iterator<News> news2 = news.iterator();
		
		try {
			
			String sql = ("Select * from news where name = '"+name+"';");
			ResultSet rs = st3.executeQuery(sql);
			System.out.println(sql);
			int id=  rs.getInt("id");
			String name1 =rs.getString("name");
			int category_id=  rs.getInt("category_id");
			String description =rs.getString("description");
			String detail =rs.getString("detail");
			String image =rs.getString("image");
			Date date=(Date) rs.getDate("date");					//ép kiểu 
			String user_id =rs.getString("user_id");
			System.out.println(id+"  | "+ category_id+"           | "+name1+"          | "+description+" | "+detail+" |  "+image+"  | "+date+" | "+user_id );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	@Override
	public List<News> getNews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateNewsByName(Statement st5) {
		// TODO Auto-generated method stub
		System.out.println("name:");
		String name = scanner.nextLine();
		System.out.println("idInput:");
		int idInput = scanner.nextInt();
		try {
			String sql = "update news set id ="+idInput+";";
			st5.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void menu() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	do {	
		System.out.println("MENU");
		System.out.println("1.Add News");
		System.out.println("2.Delete News by name ");
		System.out.println("3.Find News by name");
		System.out.println("4.Get News");
		System.out.println("5.Update News by name");
		System.out.println("6.Exit");
		System.out.println("=========================");
		System.out.println("Nhap:");
		int n = scanner.nextInt();
		switch(n) {
		case (1):
			addNews(null);
			break;
		case (2):
			deleteNewsByName(null);
			break;
		case (3):
			findNewsByName(null);
			break;
		case (4):
			getNews();
			break;
		case (5):
			updateNewsByName(null);
			break;
		case (6):
			return;
			
		default:
			System.out.println("nhap lai:");
			break;
		}
	}while(true);
	}
	
}
