package net.yxcoding.ffmpeg;

/**
 * @author yaxiong.fang
 * @Description: ${}
 * @Date 2017/4/17 0017
 * @Time 15:22
 */
public class FFmpegUtil {

    static {
        /*System.loadLibrary("avcodec-57");
        System.loadLibrary("avdevice-57");
        System.loadLibrary("avfilter-6");
        System.loadLibrary("avformat-57");
        System.loadLibrary("avutil-55");
        System.loadLibrary("swresample-2");
        System.loadLibrary("swscale-4");*/
        System.loadLibrary("ffmpegtest");
    }
    public static native String ffmpegInfo();
}
