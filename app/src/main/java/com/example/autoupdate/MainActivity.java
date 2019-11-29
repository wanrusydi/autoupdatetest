package com.example.autoupdate;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.github.javiersantos.appupdater.AppUpdater;
import com.github.javiersantos.appupdater.enums.UpdateFrom;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AppUpdater(this)
                .setUpdateFrom(UpdateFrom.GITHUB)
                .setGitHubUserAndRepo("wanrusydi", "autoupdatetest")
                .start();
        Test();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
    }

    private void Test()
    {
        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
        Test2();
    }

    private void Test2()
    {
        Toast.makeText(this, "Test2", Toast.LENGTH_SHORT).show();
        Test3();
    }

    private void Test3()
    {
        Toast.makeText(this, "Test3", Toast.LENGTH_SHORT).show();
        Test4();
    }

    private void Test4()
    {
        Toast.makeText(this, "Test4", Toast.LENGTH_SHORT).show();
    }
}
