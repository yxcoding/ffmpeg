package net.yxcoding.ffmpeg;

import android.graphics.PixelFormat;
import android.os.Bundle;
import android.os.Environment;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import org.libsdl.app.SDLActivity;

import java.io.File;

public class MainActivity extends SDLActivity implements SurfaceHolder.Callback {

    private SurfaceView surfaceView;
    private SurfaceHolder surfaceHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
       /* File videoFile = new File(Environment.getExternalStorageDirectory(), "1234.mp4");
        FFmpegUtil.playVideo(videoFile.getAbsolutePath(), getNativeSurface());*/

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                File videoFile = new File(Environment.getExternalStorageDirectory(), "1234.mp4");
                FFmpegUtil.playVideo(videoFile.getAbsolutePath(), surfaceHolder.getSurface());
            }
        }).start();*/
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
