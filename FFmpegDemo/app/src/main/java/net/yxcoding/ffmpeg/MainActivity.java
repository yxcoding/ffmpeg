package net.yxcoding.ffmpeg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        //tv.setText(FFmpegUtil.sendPostRequest("http://web.juhe.cn:8080/environment/air/cityair", null));
        //tv.setText(FFmpegUtil.sendPostRequest("http://www.baidu.com", null));
    }
}
