package org.spring.cert.application.controller;

import org.spring.cert.application.view.AddNumbersView;
import org.spring.cert.framework.controller.ControllerMapping;
import org.spring.cert.framework.controller.IController;
import org.spring.cert.framework.ds.ModelAndView;
import org.spring.cert.framework.model.Model;
import org.spring.cert.framework.model.SimpleModel;

import javax.servlet.http.HttpServletRequest;

import static java.lang.String.valueOf;

@ControllerMapping("/add-numbers")
public class AddNumbersController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest req) {
        Model model = new SimpleModel();

        int numberA = Integer.parseInt(req.getParameter("numberA"));
        int numberB = Integer.parseInt(req.getParameter("numberB"));

        model.set("numberA", valueOf(numberA));
        model.set("numberB", valueOf(numberB));
        model.set("result", valueOf(numberA + numberB));

        return new ModelAndView(
                model,
                new AddNumbersView()
        );
    }
}
