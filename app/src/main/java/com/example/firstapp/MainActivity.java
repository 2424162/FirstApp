package com.example.firstapp;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.app.ActivityCompat;
        import androidx.core.content.ContextCompat;

        import android.Manifest;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.os.Bundle;
        import android.provider.Settings;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

        import com.example.firstapp.Shower;

public class MainActivity extends AppCompatActivity {


    public static String tag = "test1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"onCreate");
        //Listener();

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BigFileActivity.class);
                startActivity(intent);
            }
        });

        //storeTest();
    }
    public void storeTest(){
        int hasWriteStoragePermission = ContextCompat.checkSelfPermission(getApplication(), Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            //没有权限则申请权限
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
        }else {
            //有权限直接执行,docode()不用做处理


        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case 1:
                if (grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    //执行代码,这里是已经申请权限成功了,可以不用做处理
                    Log.d("test","haha");

                }else{
                    Log.d(tag,"失败");
                }
                break;
        }
    }


    public void Listener(){

        Served served = new Served();
        Shower shower = new Shower();
        Oberver oberver1 = shower.new Boy();
        Oberver oberver2 = shower.new Girl();

        served.add(oberver1);
        served.add(oberver2);
        served.mnotify();
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"onPause");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(tag,"onResume");
    }
}
