package br.com.projetojsf.filter;

import br.com.projetojsf.bean.login.LoginBean;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFIlter implements Filter {
    @Inject
    private LoginBean loginBean;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        String url = req.getRequestURL().toString();
        if(url.contains("/restricted") && loginBean.getEstudante() == null){
            //esse metodo serve para pegar o contexto e o PATH e redirecionar para a tela
            //no caso login
            res.sendRedirect(req.getServletContext().getContextPath() + "/login.xhtml");
        }else{
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
