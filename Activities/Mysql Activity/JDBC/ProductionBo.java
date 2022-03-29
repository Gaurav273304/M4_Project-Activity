package com.ltts.productionproject.bo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.ltts.productionproject.model.Production;

public class ProductionBo {
	public boolean insertProductions1(Production p)throws Exception{
		//DB logic
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/productions","root","G@u273304");
		Statement s=c.createStatement();
		boolean b=s.execute("insert into Productions1 values("+p.getProductionid()+",'"+p.getProductionname()+"','"+p.getAddress()+"',"+p.getDateofstarted()+",'"+p.getOwnername()+"')");
		c.close();
		return b;
	}
	public List<Production> getAllproduction()throws Exception{
		List<Production> al=new ArrayList<Production>();
		//DB Logic
		//Class.forName()
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/productions", "root","G@u273304");

		PreparedStatement ps=c.prepareStatement("select * from productions1");

		ResultSet rs=ps.executeQuery();

		while(rs.next()) {
			al.add(new Production(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)));

		}

		c.close();

		return al;

	}

    public List<Production> getProductionBySkill(String skill) throws Exception{

    	List<Production> li=new ArrayList<Production>();
    	//Apply DB Logic

    	return li;

    }

    public boolean updateProduction(Production p)throws Exception{

    	//Apply DB Logic

    	return false;

    }

    public boolean deleteProduction(int Production)throws Exception{

    	return false;

    }

    public Production getProductionById(int Productionid)throws Exception{

    	Production p=new Production();

    	return p;

    }



		}

 