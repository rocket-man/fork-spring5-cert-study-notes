package org.spring.cert.common.weight;

public class BoldFontWeightRenderer implements IFontWeightRenderer{
    @Override
    public String render(String text) {
        return "<bold-weight>" + text + "</bold-weight>";
    }
}
