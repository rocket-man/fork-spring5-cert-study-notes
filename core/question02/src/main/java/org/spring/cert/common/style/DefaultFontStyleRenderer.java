package org.spring.cert.common.style;

public class DefaultFontStyleRenderer implements IFontStyleRenderer {
    @Override
    public String render(String text) {
        return "<default-style>" + text + "</default-style>";
    }
}
