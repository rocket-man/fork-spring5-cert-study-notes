package org.spring.cert.framework.controller;

import org.spring.cert.framework.ds.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public interface IController {
    ModelAndView handleRequest(HttpServletRequest req);
}
