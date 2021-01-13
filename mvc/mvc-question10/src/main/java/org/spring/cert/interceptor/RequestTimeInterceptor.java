package org.spring.cert.interceptor;

import org.spring.cert.ds.MutableCountHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@Component
public class RequestTimeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("processing-time", LocalDateTime.now());

        if (request.getSession().getAttribute("mutableCountHolder") == null)
            request.getSession().setAttribute("mutableCountHolder", new MutableCountHolder());

        return true;
    }
}
