package net.runelite.client.util;

import com.apple.eawt.FullScreenAdapter;
import com.apple.eawt.FullScreenUtilities;
import com.apple.eawt.event.FullScreenEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;

@Slf4j
@RequiredArgsConstructor
class OSXFullScreenAdapter extends FullScreenAdapter
{
    private final Frame frame;

    @Override
    public void windowEnteredFullScreen(FullScreenEvent e)
    {
        log.debug("Window entered fullscreen mode--setting extended state to {}", Frame.MAXIMIZED_BOTH);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    @Override
    public void windowExitedFullScreen(FullScreenEvent e)
    {
        log.debug("Window exited fullscreen mode--setting extended state to {}", Frame.NORMAL);
        frame.setExtendedState(Frame.NORMAL);
    }

    public static void install(Frame frame)
    {
        FullScreenUtilities.addFullScreenListenerTo(frame, new OSXFullScreenAdapter(frame));
    }
}