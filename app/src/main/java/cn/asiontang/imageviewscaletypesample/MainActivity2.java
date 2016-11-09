package cn.asiontang.imageviewscaletypesample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;

public class MainActivity2 extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //禁用Android系统的默认切换动画效果
        overridePendingTransition(Animation.INFINITE, Animation.INFINITE);

        setContentView(R.layout.activity_main2);
        findViewById(R.id.main).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(final View v)
            {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
    }
}
