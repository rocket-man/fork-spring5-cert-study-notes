package org.spring.cert.application.controller;

import org.spring.cert.application.view.IndexView;
import org.spring.cert.framework.controller.ControllerMapping;
import org.spring.cert.framework.controller.IController;
import org.spring.cert.framework.ds.ModelAndView;
import org.spring.cert.framework.model.SimpleModel;

import javax.servlet.http.HttpServletRequest;

@ControllerMapping("/")
public class IndexController implements IController {

    @Override
    public ModelAndView handleRequest(HttpServletRequest req) {
        return new ModelAndView(
                new SimpleModel(),
                new IndexView()
        );
    }
}
