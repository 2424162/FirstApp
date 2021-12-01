package com.example.firstapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class BigFileActivity extends AppCompatActivity {
    public List<FileInfo> list = new ArrayList<FileInfo>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bigfilelayout);
        getViewList();
    }

    public void getViewList() {
        String[] strings = {"11", "88", "99"};
        initFile();
        ArrayAdapter<FileInfo> adapter = new FileAdapter(this, R.layout.bigfile_layput, list);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }

    public void initFile() {
        for (int i = 0; i < 30; i++) {
            FileInfo fileInfo = new FileInfo("文件名" + i, "大小" + i, R.drawable.ic_launcher_foreground);
            list.add(fileInfo);

        }

    }
}
