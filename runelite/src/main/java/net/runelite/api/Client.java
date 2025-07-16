package net.runelite.api;

import net.runelite.api.hooks.Callbacks;
import org.slf4j.Logger;

import java.awt.*;
import java.util.EnumSet;

public interface Client extends GameEngine
{
    /**
     * The injected client invokes these callbacks to send events to us
     */
    Callbacks getCallbacks();

    /**
     * Retrieve a global logger for the client.
     * This is most useful for mixins which can't have their own.
     */
    Logger getLogger();

    /**
     * Gets a set of current world types that apply to the logged in world.
     *
     * @return the types for current world
     */
    EnumSet<WorldType> getWorldType();

    /**
     * Gets the current server tick count.
     *
     * @return the tick count
     */
    int getTickCount();

	@Override
	Canvas getCanvas();

    /**
     * Sets the current server tick count.
     *
     * @param tickCount the new tick count
     */
    void setTickCount(int tickCount);

    /**
     * Checks whether the client is in stretched mode.
     *
     * @return true if the client is in stretched mode, false otherwise
     */
    boolean isStretchedEnabled();

    /**
     * Sets the client stretched mode state.
     *
     * @param state new stretched mode state
     */
    void setStretchedEnabled(boolean state);

    /**
     * Checks whether the client is using fast
     * rendering techniques when stretching the canvas.
     *
     * @return true if stretching is fast rendering, false otherwise
     */
    boolean isStretchedFast();

    /**
     * Sets whether to use fast rendering techniques
     * when stretching the canvas.
     *
     * @param state new fast rendering state
     */
    void setStretchedFast(boolean state);

    /**
     * Sets whether to force integer scale factor by rounding scale
     * factors towards {@code zero} when stretching.
     *
     * @param state new integer scaling state
     */
    void setStretchedIntegerScaling(boolean state);

    /**
     * Sets whether to keep aspect ratio when stretching.
     *
     * @param state new keep aspect ratio state
     */
    void setStretchedKeepAspectRatio(boolean state);

    /**
     * Sets the scaling factor when scaling resizable mode.
     *
     * @param factor new scaling factor
     */
    void setScalingFactor(int factor);


    /**
     * @return Scaling factor that was set for stretched mode.
     */
    double getScalingFactor();

    /**
     * Invalidates cached dimensions that are
     * used for stretching and scaling.
     *
     * @param resize true to tell the game to
     *               resize the canvas on the next frame,
     *               false otherwise.
     */
    void invalidateStretching(boolean resize);

    /**
     * Gets the current stretched dimensions of the client.
     *
     * @return the stretched dimensions
     */
    Dimension getStretchedDimensions();

    /**
     * Gets the real dimensions of the client before being stretched.
     *
     * @return the real dimensions
     */
    Dimension getRealDimensions();

	/**
	 * Gets the current position of the mouse on the canvas.
	 *
	 * @return the mouse canvas position
	 */
	Point getMouseCanvasPosition();

	/**
	 * Gets the x-axis offset of the viewport.
	 *
	 * @return the x-axis offset
	 */
	int getViewportXOffset();

	/**
	 * Gets the y-axis offset of the viewport.
	 *
	 * @return the y-axis offset
	 */
	int getViewportYOffset();

    /**
     * Creates a sprite image with given width and height containing the
     * pixels.
     *
     * @param pixels the pixels
     * @param width  the width
     * @param height the height
     * @return the sprite image
     */
    SpritePixels createSpritePixels(int[] pixels, int width, int height);

    /**
     * Creates an empty indexed sprite.
     *
     * @return the sprite
     */
    IndexedSprite createIndexedSprite();

    /**
     * Gets the current game state.
     *
     * @return the game state
     */
    GameState getGameState();


	long getAccountHash();

	/**
	 * Causes the client to shutdown. It is faster than
	 * {@link java.applet.Applet#stop()} because it doesn't wait for 4000ms.
	 * This will call {@link System#exit} when it is done
	 */
	void stopNow();

    boolean isGpu();

    boolean isResized();

    void setStopTimeMs(long time);

}