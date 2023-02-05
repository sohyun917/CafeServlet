package cafeInven.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cafeInven.model.service.CafeInvenService;
import cafeInven.model.vo.CafeInven;

/**
 * Servlet implementation class InOutServlet
 */
@WebServlet("/cafeinven/inout.sso")
public class InOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InOutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/view/cafeinven/inout.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String stockName = request.getParameter("sname");
		int inout = Integer.parseInt(request.getParameter("inout"));
		
		CafeInven cInven = new CafeInven();
		
		cInven.setName(stockName);
		cInven.setInoutStock(inout);
		CafeInvenService cService = new CafeInvenService();
		int result = cService.inoutMenu(cInven);
		if(result > 0) {
			response.sendRedirect("/index.jsp");
		}else {
			request.setAttribute("title", "입출고내역입력실패");
			request.setAttribute("msg", "입출고내역이 제대로 입력되지 않았습니다.");
			request.getRequestDispatcher("/WEB-INF/view/member/error.jsp").forward(request, response);
		}
	}

}
