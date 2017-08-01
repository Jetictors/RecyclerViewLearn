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
import com.features.moneies.article.recyclerviewlearn.bean.AlipayIndexBean;
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

    private List<FunctionItem> functionItems;
    private List<AlipayIndexBean> alipayIndexBeanList;

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

        /*
            确定数据类型
            1、下拉刷新类型
            2、账单类型
            3、底部栏类型

            4、支付助手类型
            5、健康 天气关怀类型
            6、健康 大病无忧宝类型
            7、保险类型
            8、蚂蚁森林类型

            9、蚂蚁保卡类型
            10、奖励金类型

            11、飞猪酒店类型
            12、无线金城帝网类型
            13、AR识花类型
         */
        //模拟数据
        alipayIndexBeanList = new ArrayList<>();
        alipayIndexBeanList.add(0,new AlipayIndexBean(1,null,null,null,null));

        alipayIndexBeanList.add(1,new AlipayIndexBean(4,new AlipayIndexBean.AlipayHelper("支付助手","昨天 晚上19：20","￥5.23","付款成功","吃饭 大保健","查看更多")
                ,null,null,null));

        alipayIndexBeanList.add(2,new AlipayIndexBean(5,new AlipayIndexBean.AlipayHelper("健康 天气关怀","昨天 下午14：20","高温天气送健康","重庆温度高达39度","领取健康豆","立即参看")
                ,null,null,null));

        alipayIndexBeanList.add(3,new AlipayIndexBean(6,new AlipayIndexBean.AlipayHelper("保险","昨天 下午14：20","高温天气送健康","重庆温度高达39度","领取健康豆","立即参看")
                ,null,null,null));
        alipayIndexBeanList.add(4,new AlipayIndexBean(7,null,null,null,null));
        alipayIndexBeanList.add(5,new AlipayIndexBean(8,null,null,null,null));

        alipayIndexBeanList.add(6,new AlipayIndexBean(2,null
                ,new AlipayIndexBean.Bill("支付宝账单","昨天 晚上19：20","-1045.98 \n 12月支出","+105.18 \n 12月收入","查看")
                ,null,null));
        alipayIndexBeanList.add(7,new AlipayIndexBean(12,null,null,null,null));
        alipayIndexBeanList.add(8,new AlipayIndexBean(4,new AlipayIndexBean.AlipayHelper("支付助手","昨天 晚上19：20","￥5.23","付款成功","吃饭 大保健","查看更多")
                ,null,null,null));
        alipayIndexBeanList.add(9,new AlipayIndexBean(9,null,null,null,null));
        alipayIndexBeanList.add(10,new AlipayIndexBean(2,null
                ,new AlipayIndexBean.Bill("支付宝账单","昨天 下午14：20","-1045.98 \n 11月支出","+105.18 \n 12月收入","查看")
                ,null,null));
        alipayIndexBeanList.add(11,new AlipayIndexBean(10,null,null,null,null));
        alipayIndexBeanList.add(12,new AlipayIndexBean(11,null,null,null,null));
        alipayIndexBeanList.add(13,new AlipayIndexBean(12,null,null,null,null));
        alipayIndexBeanList.add(14,new AlipayIndexBean(13,null,null,null,null));
        alipayIndexBeanList.add(15,new AlipayIndexBean(3,null,null,null,null));

        mAdapter.addData(alipayIndexBeanList);
    }
}
