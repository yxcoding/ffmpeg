package net.yxcoding.ffmpeg;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.io.File;

public class MainActivity extends AppCompatActivity implements SurfaceHolder.Callback {

    private SurfaceView surfaceView;
    private SurfaceHolder surfaceHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surfaceView = (SurfaceView) findViewById(R.id.surface_view);
        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(this);

        /*new Thread(new Runnable() {
            @Override
            public void run() {
                File videoFile = new File(Environment.getExternalStorageDirectory(), "123.mp4");
                File outFile = new File(Environment.getExternalStorageDirectory(), "123.yuv");
                FFmpegUtil.videoInfo(videoFile.getAbsolutePath(), outFile.getAbsolutePath());
            }
        }).start();*/
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                File videoFile = new File(Environment.getExternalStorageDirectory(), "123.mp4");
                FFmpegUtil.playVideo(videoFile.getAbsolutePath(), surfaceHolder.getSurface());
            }
        }).start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
