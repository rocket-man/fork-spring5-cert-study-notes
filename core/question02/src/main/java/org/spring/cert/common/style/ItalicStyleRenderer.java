package org.spring.cert.common.style;

public class ItalicStyleRenderer implements IFontStyleRenderer{
    @Override
    public String render(String text) {
        return "<italic-style>" + text + "</italic-style>";
    }
}
