package cafeInven.model.service;

import java.sql.Connection;
import java.util.List;

import cafeInven.model.dao.CafeInvenDAO;
import cafeInven.model.vo.CafeInven;
import common.JDBCTemplate;

public class CafeInvenService {

	CafeInvenDAO cDao = new CafeInvenDAO();
	
	/**
	 * 입출고내역 Service
	 * @param cafe
	 * @return result
	 */
	public int inoutMenu(CafeInven cafe) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = cDao.inoutMenu(conn, cafe);
		if(result > 0) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		return result;
	}
	
	/**
	 * 재고조회 Service
	 * @return cList
	 */
	public List<CafeInven> printStock() {
		Connection conn = JDBCTemplate.getConnection();
		List<CafeInven> cList = cDao.printStock(conn);
		return cList;
	}
	
	/**
	 * 주문 Service
	 * @return cList
	 */
	public List<CafeInven> orderSys() {
		Connection conn = JDBCTemplate.getConnection();
		List<CafeInven> cList = cDao.orderSys(conn);
		return cList;
	}
}
