package com.features.moneies.article.recyclerviewlearn.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.features.moneies.article.recyclerviewlearn.R;
import com.features.moneies.article.recyclerviewlearn.adapter.MainAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_back)
    ImageView toolbarBack;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.main_recycler_view)
    RecyclerView mainRecyclerView;
    private MainAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        toolbarBack.setVisibility(View.GONE);

        initRecycler();
        initData();
    }

    /**
     * 初始化recyclerView
     */
    private void initRecycler() {
        //初始化布局管理器
        LinearLayoutManager manager = new LinearLayoutManager(this);
        //设置滑动方向
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        //给recyclerView设置布局管理器
        mainRecyclerView.setLayoutManager(manager);

        mAdapter = new MainAdapter(this);
        mainRecyclerView.setAdapter(mAdapter);

        //添加分割线 此为系统提供的默认分割线
        mainRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        if (null != mAdapter){
            mAdapter.setOnItemClickListener(position -> jumpActivity(position));
        }
    }

    /**
     * 添加数据
     */
    private void initData() {
        String items[];
        items = new String[]{
               getString(R.string.main_manager_learn),
               getString(R.string.main_item_decoration_learn),
               getString(R.string.main_more_item),
               getString(R.string.main_slide_item),
               getString(R.string.main_radio_and_check),
               getString(R.string.main_refresh),
               getString(R.string.main_item_animation),
        };

        List<String> mData = new  ArrayList<>();

        for (int i = 0 ; i < items.length ; i++){
            mData.add(i,items[i]);
        }

        mAdapter.addData(mData);
    }

    /**
     * 根据position跳转不同的页面
     * @param position
     */
    private void jumpActivity(int position) {
        Intent intent = new Intent();
        switch (position) {
            case 0:
                intent.setClass(this,LayoutTypeActivity.class);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }

        try{
            startActivity(intent);
        }catch (Exception e){

        }
    }
}
