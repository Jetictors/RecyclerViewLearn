package com.features.moneies.article.recyclerviewlearn.activity.layoutManagerType;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.features.moneies.article.recyclerviewlearn.R;
import com.features.moneies.article.recyclerviewlearn.adapter.LinearManagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 线性布局管理器的用法
 * Created by loser's computer on 2017/7/28.
 */
public class LinearManagerActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.common_recycler_view)
    RecyclerView commonRecyclerView;
    @BindView(R.id.btn_horizontal)
    TextView btnHorizontal;
    @BindView(R.id.btn_vertical)
    TextView btnVertical;

    private LinearManagerAdapter mAdapter;

    private final int MANAGER_HORIZONTAL = 1;
    private final int MANAGER_VERCITAL = 2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.common_manager);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        toolbarTitle.setText(getString(R.string.type_linear_manager_text));

        initRecyclerView(MANAGER_VERCITAL);
        initData();
    }

    private void initRecyclerView(int orientation) {
        commonRecyclerView.setLayoutManager(initLayoutManager(orientation));
        commonRecyclerView.addItemDecoration(initDividerItemDecoration(orientation));

        mAdapter = new LinearManagerAdapter(this,orientation);
        commonRecyclerView.setAdapter(mAdapter);
    }

    private void initData(){
        List<String> mData = new ArrayList<>();

        for (int i = 1 ; i <= 30 ; i++){
            mData.add(i - 1 , "item data : " + i);
        }

        mAdapter.addData(mData);
    }

    @OnClick({
            R.id.toolbar_back,
            R.id.btn_horizontal,
            R.id.btn_vertical
    })
    public void eventClick(View view){
        switch (view.getId()){
            case R.id.toolbar_back:
                this.finish();
                break;
            case R.id.btn_horizontal:
                selectColor(MANAGER_HORIZONTAL);
                initRecyclerView(MANAGER_HORIZONTAL);
                initData();
                break;
            case R.id.btn_vertical:
                selectColor(MANAGER_VERCITAL);
                initRecyclerView(MANAGER_VERCITAL);
                initData();
                break;
            default:
                break;
        }
    }

    /**
     *  初始化布局管理器
     * @param orientation 指定布局管理器的方向
     */
    private LinearLayoutManager initLayoutManager(int orientation){
        LinearLayoutManager manager = new LinearLayoutManager(this);
        if (orientation == MANAGER_HORIZONTAL){
            manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        }else {
            manager.setOrientation(LinearLayoutManager.VERTICAL);
        }
        return manager;
    }

    /**
     *  根据方向添加不同方向的分割线
     * @param orientation 指定布局管理器的方向
     */
    private DividerItemDecoration initDividerItemDecoration(int orientation){

        if (orientation == MANAGER_HORIZONTAL){
            DividerItemDecoration horizontalItemDecoration =
                    new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL);

            return horizontalItemDecoration;
        }else {
            DividerItemDecoration vercitalItemDecoration =
                    new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);

            return vercitalItemDecoration;
        }
    }

    /**
     * 根据方向改变按钮的字体颜色与背景色
     */
    private void selectColor(int orientation){
        if (orientation == MANAGER_HORIZONTAL){
            btnHorizontal.setTextColor(Color.WHITE);
            btnHorizontal.setBackgroundColor(ContextCompat.getColor(this,R.color.colorPrimary));
            btnVertical.setTextColor(Color.BLACK);
            btnVertical.setBackgroundColor(ContextCompat.getColor(this,android.R.color.darker_gray));
        }

        if (orientation == MANAGER_VERCITAL){
            btnVertical.setTextColor(Color.WHITE);
            btnVertical.setBackgroundColor(ContextCompat.getColor(this,R.color.colorPrimary));
            btnHorizontal.setTextColor(Color.BLACK);
            btnHorizontal.setBackgroundColor(ContextCompat.getColor(this,android.R.color.darker_gray));
        }
    }
}
