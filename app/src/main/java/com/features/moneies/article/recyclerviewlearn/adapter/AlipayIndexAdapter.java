package com.features.moneies.article.recyclerviewlearn.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.features.moneies.article.recyclerviewlearn.R;
import com.features.moneies.article.recyclerviewlearn.bean.AlipayIndexBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by loser's computer on 2017/7/30.
 */
public class AlipayIndexAdapter extends RecyclerView.Adapter {

    private List<AlipayIndexBean> mData;
    private Context mContext;

    /**
     * 下拉刷新 itemType -> ITEM_TYPE_HEADER
     * 账单：itemType -> ITEM_TYPE_BILL
     * 支付助手/健康/保险/蚂蚁森林/：itemType -> ITEM_TYPE_ALIPAY
     * 蚂蚁保卡/奖励金：itemType -> ITEM_TYPE_CARD
     * 飞猪酒店/无线金城帝网/AR识花：itemType -> ITEM_TYPE_OTHER
     * 底部栏：itemType -> ITEM_TYPE_FOOTER
     */
    public static final int ITEM_TYPE_HEADER = 1;
    public static final int ITEM_TYPE_BILL = 2;
    public static final int ITEM_TYPE_ALIPAY_HELPER = 3;
    public static final int ITEM_TYPE_CARD = 4;
    public static final int ITEM_TYPE_OTHER = 5;
    public static final int ITEM_TYPE_FOOTER = 6;

    public AlipayIndexAdapter() {
    }

    public AlipayIndexAdapter(Context mContext) {
        this.mContext = mContext;
        mData = new ArrayList<>();
    }

    public void addData(List<AlipayIndexBean> datas) {
        mData.clear();
        mData.addAll(datas);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view;
        switch (viewType) {
            case ITEM_TYPE_HEADER:
                view = layoutInflater.inflate(R.layout.item_alipay_index_header, parent, false);
                return new HeaderViewHolder(view);
            case ITEM_TYPE_BILL:
                view = layoutInflater.inflate(R.layout.item_alipay_index_bill, parent, false);
                return new BillViewHolder(view);
            case ITEM_TYPE_ALIPAY_HELPER:
                view = layoutInflater.inflate(R.layout.item_alipay_index_helper, parent, false);
                return new AlipayHelperViewHolder(view);
            case ITEM_TYPE_CARD:
                view = layoutInflater.inflate(R.layout.item_alipay_index_card, parent, false);
                return new CardViewHolder(view);
            case ITEM_TYPE_OTHER:
                view = layoutInflater.inflate(R.layout.item_alipay_index_other, parent, false);
                return new OtherViewHolder(view);
            case ITEM_TYPE_FOOTER:
                view = layoutInflater.inflate(R.layout.item_alipay_index_footer, parent, false);
                return new FooterViewHolder(view);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case ITEM_TYPE_HEADER:
                break;
            case ITEM_TYPE_BILL:
                break;
            case ITEM_TYPE_ALIPAY_HELPER:
                break;
            case ITEM_TYPE_CARD:
                break;
            case ITEM_TYPE_OTHER:
                break;
            case ITEM_TYPE_FOOTER:
                break;
            default:
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public int getItemViewType(int position) {
        switch (mData.get(position).getItemType()) {
            case 1:
                return ITEM_TYPE_HEADER;
            case 2:
                return ITEM_TYPE_BILL;
            case 3:
                return ITEM_TYPE_FOOTER;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return ITEM_TYPE_ALIPAY_HELPER;
            case 9:
            case 10:
                return ITEM_TYPE_CARD;
            case 11:
            case 12:
            case 13:
                return ITEM_TYPE_OTHER;
            default:
                return 0;
        }
    }

    /**
     * 顶部栏 ViewHolder （下拉刷新）
     */
    public class HeaderViewHolder extends RecyclerView.ViewHolder {
        public HeaderViewHolder(View itemView) {
            super(itemView);
        }
    }

    /**
     * 支付宝账单 ViewHolder
     */
    public class BillViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.common_title_icon)
        ImageView commonTitleIcon;
        @BindView(R.id.common_title_type_text)
        TextView commonTitleTypeText;
        @BindView(R.id.common_title_time_text)
        TextView commonTitleTimeText;
        @BindView(R.id.common_more)
        ImageView commonMore;
        @BindView(R.id.bill_expend_text)
        TextView billExpendText;
        @BindView(R.id.bill_income_text)
        TextView billIncomeText;
        @BindView(R.id.common_two_btn_left)
        TextView commonTwoBtnLeft;
        @BindView(R.id.common_two_line)
        TextView commonTwoLine;
        @BindView(R.id.common_two_btn_right)
        TextView commonTwoBtnRight;

        public BillViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    /**
     * 支付助手 ViewHolder
     */
    public class AlipayHelperViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.common_title_icon)
        ImageView commonTitleIcon;
        @BindView(R.id.common_title_type_text)
        TextView commonTitleTypeText;
        @BindView(R.id.common_title_time_text)
        TextView commonTitleTimeText;
        @BindView(R.id.common_more)
        ImageView commonMore;
        @BindView(R.id.common_content_hint_first)
        TextView commonContentHintFirst;
        @BindView(R.id.common_content_hint_second)
        TextView commonContentHintSecond;
        @BindView(R.id.common_content_hint_third)
        TextView commonContentHintThird;
        @BindView(R.id.common_two_btn_left)
        TextView commonTwoBtnLeft;
        @BindView(R.id.common_two_line)
        TextView commonTwoLine;
        @BindView(R.id.common_two_btn_right)
        TextView commonTwoBtnRight;

        public AlipayHelperViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    /**
     * 蚂蚁宝卡 ViewHolder
     */
    public class CardViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.common_title_icon)
        ImageView commonTitleIcon;
        @BindView(R.id.common_title_type_text)
        TextView commonTitleTypeText;
        @BindView(R.id.common_title_time_text)
        TextView commonTitleTimeText;
        @BindView(R.id.common_more)
        ImageView commonMore;
        @BindView(R.id.common_two_btn_left)
        TextView commonTwoBtnLeft;
        @BindView(R.id.common_two_line)
        TextView commonTwoLine;
        @BindView(R.id.common_two_btn_right)
        TextView commonTwoBtnRight;
        @BindView(R.id.item_other)
        LinearLayout itemOther;

        public CardViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    /**
     * 其他
     */
    public class OtherViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.common_title_icon)
        ImageView commonTitleIcon;
        @BindView(R.id.common_title_type_text)
        TextView commonTitleTypeText;
        @BindView(R.id.common_title_time_text)
        TextView commonTitleTimeText;
        @BindView(R.id.common_more)
        ImageView commonMore;
        @BindView(R.id.common_content_hint_first)
        TextView commonContentHintFirst;
        @BindView(R.id.common_content_hint_second)
        TextView commonContentHintSecond;
        @BindView(R.id.common_content_hint_third)
        TextView commonContentHintThird;
        @BindView(R.id.item_other)
        LinearLayout itemOther;

        public OtherViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    /**
     * 底部栏 ViewHolder （我是有底线的）
     */
    public class FooterViewHolder extends RecyclerView.ViewHolder {
        public FooterViewHolder(View itemView) {
            super(itemView);
        }
    }

}
