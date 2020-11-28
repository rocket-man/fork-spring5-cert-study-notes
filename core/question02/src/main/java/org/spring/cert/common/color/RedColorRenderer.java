package org.spring.cert.common.color;

public class RedColorRenderer implements IFontColorRenderer{
    @Override
    public String render(String text) {
        return "<red-color>" + text + "</red-color>";
    }
}
