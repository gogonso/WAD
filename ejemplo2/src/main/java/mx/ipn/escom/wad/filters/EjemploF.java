package mx.ipn.escom.wad.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class EjemploF
 */
public class EjemploF implements Filter {

	/**
	 * Default constructor.
	 */
	public EjemploF() {
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("---> Finalizando Filter: EjemploF");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		System.out.println("Filtrando peticion F: " + httpRequest.getRequestURL() + " - " + httpRequest.getMethod());
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("--> Inicializando Filter: EjemploF");
	}

}
