package com.example.user.muxing;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aryan.dhankar.muxlibrary.Mp4ParserAudioMuxer;

public class MainActivity extends AppCompatActivity {
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go=(Button)findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String root = Environment.getExternalStorageDirectory().getPath();
                String audiopath = root + "/"+"Downloads/audio";
                String videopath = root+ "/"+"Downloads/video.mp4";
                Mp4ParserAudioMuxer muxer=new Mp4ParserAudioMuxer();
          boolean result=muxer.mux(videopath,audiopath,Environment.getExternalStorageDirectory().getPath()+"/out.mp4");
     if (result==true){
         Toast.makeText(getApplicationContext(), "Muxing completed", Toast.LENGTH_SHORT).show();
     }else {

         Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
     }
            }
        });
    }



}