package web;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.io.font.FontProgram;
import com.itextpdf.io.font.FontProgramFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;

/**
 * Servlet implementation class UplaodFichier
 */
@WebServlet("/UplaodFichier")
public class UplaodFichier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UplaodFichier() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/view/confirmation.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String masterPath = request.getServletContext().getRealPath("/WEB-INF/Reçue.pdf");
		response.setContentType("application/pdf");

		try (PdfReader reader = new PdfReader(masterPath);
				PdfWriter writer = new PdfWriter(response.getOutputStream());
				PdfDocument document = new PdfDocument(reader, writer)) {

			PdfPage page = document.getPage(1);
			PdfCanvas canvas = new PdfCanvas(page);

			FontProgram fontProgram = FontProgramFactory.createFont();
			PdfFont font = PdfFontFactory.createFont("utf-8");
			canvas.setFontAndSize(font, 12);

			canvas.beginText();

			canvas.setTextMatrix(0, 0);
			canvas.showText("Origine");

			canvas.setTextMatrix(470, 760);

			NumberFormat formatter = NumberFormat.getNumberInstance(new Locale("fr", "FR"));

		}

	}
}
