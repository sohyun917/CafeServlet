package cafeInven.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cafeInven.model.vo.CafeInven;

public class CafeInvenDAO {

	/**
	 * 입출고내역 DAO
	 * @param conn
	 * @param cafe
	 * @return result
	 */
	public int inoutMenu(Connection conn, CafeInven cafe) {
		String sql = "INSERT INTO CAFEINVEN VALUES(?, ?, DEFAULT)";
		int result = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cafe.getName());
			pstmt.setInt(2, cafe.getInoutStock());
			result = pstmt.executeUpdate();
			
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 재고내역 DAO
	 * @param conn
	 * @return cList
	 */
	public List<CafeInven> printStock(Connection conn) {
		List<CafeInven> cList = null;
		try {
			String sql = "SELECT * FROM CAFEINVEN";
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			cList = new ArrayList<CafeInven>();
			while(rset.next()) {
				CafeInven cafe = new CafeInven();
				cafe.setName(rset.getString("NAME"));
				cafe.setInoutStock(rset.getInt("STOCK"));
				cafe.setInoutTime(rset.getDate("INOUTDATE"));
				cList.add(cafe);
			}
			conn.close();
			stmt.close();
			rset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cList;
	}
	
	/**
	 * 주문 DAO
	 * @param conn
	 * @return cList
	 */
	public List<CafeInven> orderSys(Connection conn) {
		String sql = "SELECT * FROM CAFEINVEN WHERE STOCK <= 3";
		List<CafeInven> cList = null;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			cList = new ArrayList<CafeInven>();
			while(rset.next()) {
				CafeInven cafe = new CafeInven();
				cafe.setName(rset.getString("NAME"));
				cafe.setInoutStock(rset.getInt("STOCK"));
				cList.add(cafe);
			}
			conn.close();
			stmt.close();
			rset.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cList;
	}
}
