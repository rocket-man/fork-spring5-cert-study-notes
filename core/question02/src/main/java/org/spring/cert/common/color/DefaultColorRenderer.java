package org.spring.cert.common.color;

public class DefaultColorRenderer implements IFontColorRenderer {
    @Override
    public String render(String text) {
        return "<default-color>" + text + "</default-color>";
    }
}
