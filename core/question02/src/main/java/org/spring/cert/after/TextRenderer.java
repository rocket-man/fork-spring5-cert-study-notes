package org.spring.cert.after;

import org.spring.cert.common.IRenderer;
import org.spring.cert.common.color.DefaultColorRenderer;
import org.spring.cert.common.color.IFontColorRenderer;
import org.spring.cert.common.style.DefaultFontStyleRenderer;
import org.spring.cert.common.style.IFontStyleRenderer;
import org.spring.cert.common.weight.DefaultFontWeightRenderer;
import org.spring.cert.common.weight.IFontWeightRenderer;

public class TextRenderer {
    private final IFontStyleRenderer fontStyleRenderer;
    private final IFontColorRenderer fontColorRenderer;
    private final IFontWeightRenderer fontWeightRenderer;

    private TextRenderer(IFontStyleRenderer fontStyleRenderer,  IFontColorRenderer fontColorRenderer, IFontWeightRenderer fontWeightRenderer){
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

    public static class TextRendererBuilder{
        private IFontStyleRenderer fontStyleRenderer = new DefaultFontStyleRenderer();
        private IFontColorRenderer fontColorRenderer = new DefaultColorRenderer();
        private IFontWeightRenderer fontWeightRenderer = new DefaultFontWeightRenderer();

        public TextRenderer build(){
            return new TextRenderer(fontStyleRenderer, fontColorRenderer, fontWeightRenderer);
        }

        public TextRendererBuilder withFontStyleRenderer(IFontStyleRenderer fontStyleRenderer){
            this.fontStyleRenderer = fontStyleRenderer;
            return this;
        }

        public TextRendererBuilder withFontColorRenderer(IFontColorRenderer fontColorRenderer){
            this.fontColorRenderer = fontColorRenderer;
            return this;
        }

        public TextRendererBuilder withFontWeightRenderer(IFontWeightRenderer fontWeightRenderer){
            this.fontWeightRenderer = fontWeightRenderer;
            return this;
        }


    }
}
