package org.spring.cert.before;

import org.spring.cert.common.color.DefaultColorRenderer;
import org.spring.cert.common.color.RedColorRenderer;
import org.spring.cert.common.style.DefaultFontStyleRenderer;
import org.spring.cert.common.weight.BoldFontWeightRenderer;
import org.spring.cert.common.weight.DefaultFontWeightRenderer;

/**
 * This 'before' package does not contain a design patter and shows the following problem:
 * The issue with this approach is that everytime we want to provide a different
 * renderer we need to change the constructor objects. In addition there is a lot of code duplications
 *
 * In the 'after' package we are going to mitigate this issues by applying the builder design pattern.
 */
public class Runner {
    public static void main(String[] args) {
        TextRenderer textRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new DefaultFontWeightRenderer());
        textRenderer.renderer("Default Rendering");

        TextRenderer redRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new RedColorRenderer(), new DefaultFontWeightRenderer());
        redRenderer.renderer("Red Color Rendering");

        TextRenderer boldRenderer = new TextRenderer(new DefaultFontStyleRenderer(), new DefaultColorRenderer(), new BoldFontWeightRenderer());
        boldRenderer.renderer("Bold Rendering");

    }
}
