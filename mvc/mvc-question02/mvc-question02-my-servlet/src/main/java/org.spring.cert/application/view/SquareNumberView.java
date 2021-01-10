package org.spring.cert.application.view;

import org.spring.cert.framework.model.Model;
import org.spring.cert.framework.view.View;

public class SquareNumberView implements View {
    @Override
    public String render(Model model) {
        return String.format(
                "Square number of [%s] is [%s]",
                model.get("number"), model.get("numberSquare")
        );
    }
}
