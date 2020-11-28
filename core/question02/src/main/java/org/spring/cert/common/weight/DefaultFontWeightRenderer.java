package org.spring.cert.common.weight;

public class DefaultFontWeightRenderer implements IFontWeightRenderer{
    @Override
    public String render(String text) {
        return "<default-weight>" + text + "</default-weight>";
    }
}
