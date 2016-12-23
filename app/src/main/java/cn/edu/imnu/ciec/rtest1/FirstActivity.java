package cn.edu.imnu.ciec.rtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.EventLogTags;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    //logt + TAB
    private static final String TAG="FirstActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        //System.out.println("This is the first_layout.");
        //Log   logd + TAB
        Log.i(TAG, "onCreate: this is R.");
        Log.i(TAG,"onCreate:This is the layout.");

        Button button1= (Button) findViewById(R.id.button1);
        //设定事件监听器 当click时触发事件  下面括号里面是匿名内部类
        button1.setOnClickListener(new View.OnClickListener(){

            @Override //不是重写会报错  ctrl+o 为匿名内部类补全方法
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this,"哦 你点我了",Toast.LENGTH_LONG).show();
                        //Toast.makeText(this)
            }
        } );

    }
}
