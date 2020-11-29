package org.spring.cert.after;

import org.spring.cert.common.color.RedColorRenderer;
import org.spring.cert.common.weight.BoldFontWeightRenderer;

public class Runner {
    public static void main(String[] args) {
        TextRenderer textRenderer = new TextRenderer.TextRendererBuilder().build();
        textRenderer.renderer("Default Rendering");

        TextRenderer redRenderer = new TextRenderer.TextRendererBuilder()
                .withFontColorRenderer(new RedColorRenderer())
                .build();
        redRenderer.renderer("Red Color Rendering");

        TextRenderer boldRenderer = new TextRenderer.TextRendererBuilder()
                .withFontWeightRenderer(new BoldFontWeightRenderer())
                .build();
        boldRenderer.renderer("Bold Rendering");
    }
}
