/*
 * Copyright (c) 2015 Apostolis Iakovakis & Malamas Malamidis.
 * All rights reserved.
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
package eu.malamas.rastaman.ui.skins;

/**
 * Το interface {@code SkinObserver} προσδιορίζει τις μεθόδους που πρέπει να
 * υλοποιούν οι κλάσεις που ενδιαφέρονται να παρακολουθούν τις αλλαγές skin της
 * εφαρμογής.
 *
 * @author Malamas Malamidis
 */
public interface SkinObserver {

    /**
     * Αυτή η μέθοδος καλείται από τον παροχέα skin για να ειδοποίησει τους
     * παρατηρητές του ότι το skin της εφαρμογής έχει αλλάξει.
     */
    void update();

}
