/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.arialyy.simple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import butterknife.OnClick;
import com.arialyy.simple.base.BaseActivity;
import com.arialyy.simple.databinding.ActivityMainBinding;
import com.arialyy.simple.download.DownloadActivity;
import com.arialyy.simple.download.group.DownloadGroupActivity;
import com.arialyy.simple.test.TestMutilTaskSysDownload;
import com.arialyy.simple.upload.UploadActivity;

/**
 * Created by Aria.Lao on 2017/3/1.
 */
public class MainActivity extends BaseActivity<ActivityMainBinding> {

  @Override protected void init(Bundle savedInstanceState) {
    super.init(savedInstanceState);
    setSupportActionBar(mBar);
    mBar.setTitle("Aria  Demo");
    getSupportActionBar().setDisplayHomeAsUpEnabled(false);
  }

  @Override protected int setLayoutId() {
    return R.layout.activity_main;
  }


  @OnClick({R.id.download, R.id.upload, R.id.download_task_group})
  public void funcation(View view){
    switch (view.getId()){
      case R.id.download:
        startActivity(new Intent(this, DownloadActivity.class));
        break;
      case R.id.upload:
        startActivity(new Intent(this, UploadActivity.class));
        break;
      case R.id.download_task_group:
        startActivity(new Intent(this, DownloadGroupActivity.class));
        break;
    }

  }
}
