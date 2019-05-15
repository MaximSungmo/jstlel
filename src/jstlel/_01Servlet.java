package jstlel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/01")
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean bVal =true;
		int iVal = 1;
		float fVal =(float) 3.14;
		request.setAttribute("iVal", iVal);
		request.setAttribute("bVal", bVal);
		request.setAttribute("fVal", fVal);
		request.getRequestDispatcher("/WEB-INF/views/01.jsp").forward(request, response);
		
		// map으로 데이터 넘기기
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("iVal",iVal);
		map.put("bVal",bVal);
		map.put("fVal",fVal);
		request.setAttribute("map", map);
		
		
		// EL Scope Test
		UserVo vo = new UserVo();
		vo.setNo((long) 10);
		vo.setName("둘리");
		request.setAttribute("vo", vo);
		
		// Request scope
		UserVo vo1 = new UserVo();
		vo.setNo((long) 20);
		vo.setName("리퀘스트리");
		request.setAttribute("vo", vo1);
		

		// session scope
		UserVo vo2 = new UserVo();
		vo.setNo((long) 30);
		vo.setName("세션리");
		request.setAttribute("vo", vo2);
		
		HttpSession session = request.getSession(true);

		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
