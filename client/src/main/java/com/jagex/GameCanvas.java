package com.jagex;

import deob.ObfuscatedName;

import java.awt.*;
import java.awt.event.FocusListener;

@ObfuscatedName("akt")
public final class GameCanvas extends Canvas {

    @ObfuscatedName("akt.u")
    public java.awt.Component component;
    private static boolean shouldNotHaveFocus;

    public GameCanvas(java.awt.Component arg0) {
        this.component = arg0;
    }

    public final void update(Graphics arg0) {
        this.component.update(arg0);
    }

    public final void paint(Graphics arg0) {
        this.component.paint(arg0);
    }

    public void removeFocusListener(FocusListener l)
    {
        super.removeFocusListener(l);
        shouldNotHaveFocus = !this.hasFocus();
    }


    @Override
    public void requestFocus()
    {
        // Runescape requests focus whenever the window is resized. Because of this, PluginPanels cannot have focus
        // if they cause the sidebar to expand. This change prevents Runescape from requesting focus whenever it wants
        if (!shouldNotHaveFocus)
        {
            this.requestFocusInWindow();
        }
    }

    @Override
    public void setSize(int width, int height)
    {

        if (client.instance.isStretchedEnabled())
        {
            super.setSize(client.instance.getStretchedDimensions().width, client.instance.getStretchedDimensions().height);
        }
        else
        {
            super.setSize(width, height);
        }

    }

    @Override
    public void setLocation(int x, int y)
    {
        if (client.instance.isStretchedEnabled())
        {
            super.setLocation((getParent().getWidth() - client.instance.getStretchedDimensions().width) / 2, 0);
        }
        else
        {
            super.setLocation(x, y);
        }
    }
}
