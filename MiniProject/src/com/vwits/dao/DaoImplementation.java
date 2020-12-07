package com.vwits.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vwits.dbconnection.MyConnection;
import com.vwits.model.Faculty;
import com.vwits.model.Result;
import com.vwits.model.Student;
import com.vwits.model.Test;



public class DaoImplementation {
static MyConnection db=new MyConnection();

	
	public int saveStudent(Student s) {
		int x = 0;
		
		 

        PreparedStatement ps = db.getPreparedStatement("insert into student values(?,?,?,?,?)");
        try {
            ps.setInt(1, s.getRoll_no());
            ps.setString(2, s.getName());
            ps.setString(3, s.getPassword());
            ps.setString(4, s.getEmail());
            ps.setInt(5, s.getContact());
            
            x = ps.executeUpdate();

 

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }
        return x;
	}

	public int saveFaculty(Faculty f) {
		int x = 0;
		
		 

        PreparedStatement ps = db.getPreparedStatement("insert into faculty values(?,?,?,?,?)");
        try {
            ps.setInt(1, f.getId());
            ps.setString(2, f.getName());
            ps.setString(3, f.getPassword());
            ps.setString(4, f.getEmail());
            ps.setInt(5, f.getContact());
            
            x = ps.executeUpdate();

 

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }
        return x;
	}
	
	public int saveTest(Test t) {
		int x = 0;
		
		 

        PreparedStatement ps = db.getPreparedStatement("insert into test values(?,?,?,?,?,?,?,?)");
        try {
            ps.setInt(1, t.getSr_no());
            ps.setString(2, t.getQuestion());
            ps.setString(3, t.getOption1());
            ps.setString(4, t.getOption2());
            ps.setString(5, t.getOption3());
            ps.setString(6, t.getOption4());
            ps.setString(7, t.getCorrectans());
            ps.setInt(8, t.getMarks());
            
            
            x = ps.executeUpdate();

 

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }
        return x;
	}
	public int saveResult(Result r) {
		int x = 0;
		
		 

        PreparedStatement ps = db.getPreparedStatement("insert into result values(?,?,?)");
        try {
            
            ps.setString(1, r.getName());
            ps.setInt(2,r.getMarks() );
            ps.setInt(3, r.getTotalmarks());
            
            
            x = ps.executeUpdate();

 

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }
        return x;
	}

	public int update(Faculty s) {
		// TODO Auto-generated method stub
		int x=0;
		String sql = "UPDATE faculty SET id=?, password = ?, email = ?, contact = ?";
        sql += " WHERE name = ?";
		PreparedStatement ps=db.getPreparedStatement(sql);
		try {
			ps.setInt(1,s.getId());
            
            ps.setString(2, s.getPassword());
            ps.setString(3, s.getEmail());
            ps.setInt(4, s.getContact());
            ps.setString(5, s.getName());
	        
	        x = ps.executeUpdate();
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return x;
	}

	
	public int delete(Student s) {
		 int x = 0;

		 

	        PreparedStatement ps = db.getPreparedStatement("delete from student where id=?");
	        try {
	            ps.setInt(1, s.getRoll_no());

	 

	            x = ps.executeUpdate();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } finally {
	            db.closeConnection();
	        }
	        return x;
	}

	
	public static List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
        Statement st = db.getStatement();
        try {
            ResultSet rs = st.executeQuery("Select * from student");
            while (rs.next()) {
            	list.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5)));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }

 

        return list;
	}
	
	public static List<Faculty> getAllFaculty() {
		List<Faculty> list = new ArrayList<Faculty>();
        Statement st = db.getStatement();
        try {
            ResultSet rs = st.executeQuery("Select * from faculty");
            while (rs.next()) {
            	list.add(new Faculty(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5)));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }

 

        return list;
	}
	
	public static List<Test> getAllTest() {
		List<Test> list = new ArrayList<Test>();
        Statement st = db.getStatement();
        try {
            ResultSet rs = st.executeQuery("Select * from test");
            while (rs.next()) {
            	list.add(new Test(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getInt(8)));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }

 

        return list;
        
	}
	public static List<Result> getAllResult() {
		List<Result> list = new ArrayList<Result>();
        Statement st = db.getStatement();
        try {
            ResultSet rs = st.executeQuery("Select * from result");
            while (rs.next()) {
            	list.add(new Result( rs.getString(1), rs.getInt(2), rs.getInt(3)));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }

 

        return list;
        
	}
	public int result(Test t) {
		String ans="abc";
		int count=0;
		if(ans.equalsIgnoreCase(t.getCorrectans())) {
			count=count+t.getMarks();
		}
		
		return count;
	}
	/*public int total(List l) {
		List<Test> list=this.getAllTest();
		int total=0;
		for(int i=0;i<list.size();i++) {
			
			total=;
		}
		return total;
	}*/


}
