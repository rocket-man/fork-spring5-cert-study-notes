package org.spring.cert.application.controller;

import org.spring.cert.application.view.SquareNumberView;
import org.spring.cert.framework.controller.ControllerMapping;
import org.spring.cert.framework.controller.IController;
import org.spring.cert.framework.ds.ModelAndView;
import org.spring.cert.framework.model.Model;
import org.spring.cert.framework.model.SimpleModel;

import javax.servlet.http.HttpServletRequest;

import static java.lang.String.valueOf;

@ControllerMapping("/square-number")
public class SquareNumberController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest req) {
        Model model = new SimpleModel();

        int number = Integer.parseInt(req.getParameter("number"));
        int numberSquare = (int) Math.pow(number, 2);

        model.set("number", valueOf(number));
        model.set("numberSquare", valueOf(numberSquare));

        return new ModelAndView(
                model,
                new SquareNumberView()
        );
    }
}
