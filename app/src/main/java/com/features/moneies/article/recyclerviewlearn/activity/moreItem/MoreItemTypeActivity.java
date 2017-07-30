package com.features.moneies.article.recyclerviewlearn.activity.moreItem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.features.moneies.article.recyclerviewlearn.R;
import com.features.moneies.article.recyclerviewlearn.activity.layoutManagerType.GridManagerActivity;
import com.features.moneies.article.recyclerviewlearn.activity.layoutManagerType.LinearManagerActivity;
import com.features.moneies.article.recyclerviewlearn.adapter.MainAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 复杂且多item列表实现分类页
 * Created by loser's computer on 2017/7/29.
 */
public class MoreItemTypeActivity extends AppCompatActivity{
    @BindView(R.id.toolbar_back)
    ImageView toolbarBack;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.main_recycler_view)
    RecyclerView mainRecyclerView;
    private MainAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        toolbarBack.setOnClickListener(v -> this.finish());
        toolbarTitle.setText(getString(R.string.main_more_item));

        initRecycler();
        initData();
    }

    /**
     * 初始化recyclerView
     */
    private void initRecycler() {
        LinearLayoutManager manager = new LinearLayoutManager(this);

        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mainRecyclerView.setLayoutManager(manager);

        mAdapter = new MainAdapter(this);
        mainRecyclerView.setAdapter(mAdapter);

        mainRecyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        if (null != mAdapter){
            mAdapter.setOnItemClickListener(position -> lanuchActivity(position));
        }
    }

    /**
     * 添加数据
     */
    private void initData() {
        String items[];
        items = new String[]{
                getString(R.string.item_car_brand_text),
                getString(R.string.item_Alipay_index_text),
                getString(R.string.item_Alipay_food_text),
        };

        List<String> mData = new ArrayList<>();

        for (int i = 0 ; i < items.length ; i++){
            mData.add(i,items[i]);
        }

        mAdapter.addData(mData);
    }

    /**
     * 根据position跳转不同的页面
     * @param position
     */
    private void lanuchActivity(int position) {
        Intent intent = new Intent();
        switch (position) {
            case 0:
                break;
            case 1:
                intent.setClass(this,CopyAlipayIndexActivity.class);
                break;
            case 2:
                intent.setClass(this,CopyAlipayFoodActivity.class);
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
