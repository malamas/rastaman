/*
 * Copyright (c) 2015 Apostolis Iakovakis, Nikos Karagiannis,
 * Nikos Krommydas & Malamas Malamidis. All rights reserved.
 *
 * This file is part of Rastaman.
 *
 * Rastaman is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * Rastaman is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Rastaman.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package eap.pli24.rastaman.ui.skins;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 *
 * @author Apostolis Iakovakis
 * @author Nikos Karagiannis
 * @author Nikos Krommydas
 * @author Malamas Malamidis
 */
public class JamaicaSkin implements Skin {

    private static final Dimension MAIN_FRAME_INIT_SIZE = new Dimension(1024, 640);
    private static final Dimension MAIN_FRAME_MIN_SIZE = new Dimension(1024, 640);

    private static final int SIDEBAR_WIDTH = 240;
    private static final Color SIDEBAR_BACKGROUND = new Color(104, 104, 0);
    
    private static final boolean IS_RASTAMAN_VISIBLE = true;
    private static final Color RASTAMAN_FOREGROUND = new Color(240, 220, 48);
    private static final Font RASTAMAN_FONT = new Font("Tahoma", 1, 14);

    private static final Dimension CREDITS_SIZE = new Dimension(200, 150);
    private static final Color CREDITS_FOREGROUND = new Color(224, 224, 224);
    private static final Font CREDITS_FONT = new Font("Tahoma", 1, 11);

    private static final int HEADER_HEIGHT = 50;
    private static final Color HEADER_BACKGROUND = new Color(204, 208, 204);
    private static final Font HEADER_FONT = new Font("Tahoma", 1, 14);
    private static final Color HEADER_FOREGROUND = new Color(48, 48, 24);

    private static final int BUTTON_PANEL_HEIGHT = 42;

    private static final Color TABLE_ODD_ROW_BACKGROUND = new Color(255, 255, 255);
    private static final Color TABLE_EVEN_ROW_BACKGROUND = new Color(224, 232, 216);
    private static final Color TABLE_SELECTED_ROW_BACKGROUND = new Color(104, 104, 0);

    @Override
    public Dimension getMainFrameInitSize() {
        return MAIN_FRAME_INIT_SIZE;
    }

    @Override
    public Dimension getMainFrameMinSize() {
        return MAIN_FRAME_MIN_SIZE;
    }

    @Override
    public int getSidebarWidth() {
        return SIDEBAR_WIDTH;
    }

    @Override
    public Color getSidebarBackground() {
        return SIDEBAR_BACKGROUND;
    }

    @Override
    public boolean getRastamanVisible() {
        return IS_RASTAMAN_VISIBLE;
    }

    @Override
    public Color getRastamanForeground() {
        return RASTAMAN_FOREGROUND;
    }

    @Override
    public Font getRastamanFont() {
        return RASTAMAN_FONT;
    }

    @Override
    public Dimension getCreditsSize() {
        return CREDITS_SIZE;
    }

    @Override
    public Color getCreditsForeground() {
        return CREDITS_FOREGROUND;
    }

    @Override
    public Font getCreditsFont() {
        return CREDITS_FONT;
    }

    @Override
    public int getHeaderHeight() {
        return HEADER_HEIGHT;
    }

    @Override
    public Color getHeaderBackground() {
        return HEADER_BACKGROUND;
    }

    @Override
    public Font getHeaderFont() {
        return HEADER_FONT;
    }

    @Override
    public Color getHeaderForeground() {
        return HEADER_FOREGROUND;
    }

    @Override
    public int getButtonPanelHeight() {
        return BUTTON_PANEL_HEIGHT;
    }

    @Override
    public Color getTableOddRowBackground() {
        return TABLE_ODD_ROW_BACKGROUND;
    }

    @Override
    public Color getTableEvenRowBackground() {
        return TABLE_EVEN_ROW_BACKGROUND;
    }

    @Override
    public Color getTableSelectedRowBackground() {
        return TABLE_SELECTED_ROW_BACKGROUND;
    }

}
