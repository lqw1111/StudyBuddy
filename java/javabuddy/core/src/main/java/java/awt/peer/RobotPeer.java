/*
 * @(#)RobotPeer.java	1.11 08/04/30
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package java.awt.peer;

import java.awt.*;

/**
 * RobotPeer defines an interface whereby toolkits support automated testing
 * by allowing native input events to be generated from Java code.
 *
 * This interface should not be directly imported by code outside the
 * java.awt.* hierarchy; it is not to be considered public and is subject
 * to change.
 *
 * @version 	1.11, 04/30/08
 * @author 	Robi Khan
 */
public interface RobotPeer
{
    public void mouseMove(int x, int y);
    public void mousePress(int buttons);
    public void mouseRelease(int buttons);

    public void mouseWheel(int wheelAmt);

    public void keyPress(int keycode);
    public void keyRelease(int keycode);

    public int getRGBPixel(int x, int y);
    public int [] getRGBPixels(Rectangle bounds);

    public void dispose();
}
