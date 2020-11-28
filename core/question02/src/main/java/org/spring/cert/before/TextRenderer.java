package org.spring.cert.before;

import org.spring.cert.common.IRenderer;
import org.spring.cert.common.color.IFontColorRenderer;
import org.spring.cert.common.style.IFontStyleRenderer;
import org.spring.cert.common.weight.IFontWeightRenderer;

public class TextRenderer {

    private final IFontStyleRenderer fontStyleRenderer;
    private final IFontColorRenderer fontColorRenderer;
    private final IFontWeightRenderer fontWeightRenderer;

    public TextRenderer(IFontStyleRenderer fontStyleRenderer,  IFontColorRenderer fontColorRenderer, IFontWeightRenderer fontWeightRenderer){
        this.fontStyleRenderer = fontStyleRenderer;
        this.fontColorRenderer = fontColorRenderer;
        this.fontWeightRenderer = fontWeightRenderer;
    }

    public void renderer(String text){
        String renderedText = applyRendering(text, fontStyleRenderer, fontColorRenderer, fontWeightRenderer);

        System.out.println(renderedText);
    }

    private String applyRendering(String text, IRenderer... renderers){
        for(IRenderer renderer : renderers){
            text = renderer.render(text);
        }
        return text;
    }
}
