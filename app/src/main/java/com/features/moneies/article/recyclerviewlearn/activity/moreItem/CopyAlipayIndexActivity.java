package com.features.moneies.article.recyclerviewlearn.activity.moreItem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.features.moneies.article.recyclerviewlearn.R;
import com.features.moneies.article.recyclerviewlearn.adapter.AlipayIndexAdapter;
import com.features.moneies.article.recyclerviewlearn.adapter.FunctionAdapter;
import com.features.moneies.article.recyclerviewlearn.bean.FunctionItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 仿照支付宝首页效果
 * Created by loser's computer on 2017/7/29.
 */
public class CopyAlipayIndexActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_back)
    ImageView toolbarBack;
    @BindView(R.id.toolbar_title)
    TextView toolbarTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.alipay_index_recycler_view)
    RecyclerView alipayIndexRecyclerView;
    @BindView(R.id.function_recycler_view)
    RecyclerView functionRecyclerView;

    private AlipayIndexAdapter mAdapter;
    private FunctionAdapter functionAdapter;

    private  List<FunctionItem> functionItems;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copy_alipay_index);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);
        toolbarTitle.setText(getString(R.string.item_Alipay_index_text));
        toolbarBack.setOnClickListener(v -> this.finish());

        initRecyclerView();
        initData();
    }

    private void initRecyclerView() {
        alipayIndexRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new AlipayIndexAdapter(this);
        alipayIndexRecyclerView.setAdapter(mAdapter);

        functionRecyclerView.setLayoutManager(new GridLayoutManager(this,4));
        functionAdapter = new FunctionAdapter(this);
        functionRecyclerView.setAdapter(functionAdapter);

        if (null != functionAdapter){
            functionAdapter.setOnItemClickListener(position -> {
                Toast.makeText(this,functionItems.get(position).getText(),Toast.LENGTH_SHORT).show();
            });
        }
    }

    private void initData() {
        functionItems = new ArrayList<>();
        functionItems.add(new FunctionItem(R.drawable.ic_credit_card_black_24dp, "转账"));
        functionItems.add(new FunctionItem(R.drawable.ic_credit_card_black_24dp, "信用卡还款"));
        functionItems.add(new FunctionItem(R.drawable.ic_credit_card_black_24dp, "充值中心"));
        functionItems.add(new FunctionItem(R.drawable.ic_credit_card_black_24dp, "蚂蚁财富"));
        functionItems.add(new FunctionItem(R.drawable.ic_credit_card_black_24dp, "淘宝票"));
        functionItems.add(new FunctionItem(R.drawable.ic_credit_card_black_24dp, "花呗"));
        functionItems.add(new FunctionItem(R.drawable.ic_credit_card_black_24dp, "共享单车"));
        functionItems.add(new FunctionItem(R.drawable.ic_credit_card_black_24dp, "更多"));

        functionAdapter.addData(functionItems);
    }
}
