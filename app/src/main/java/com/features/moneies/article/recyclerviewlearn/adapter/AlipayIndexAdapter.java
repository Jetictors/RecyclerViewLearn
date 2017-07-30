package com.features.moneies.article.recyclerviewlearn.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.features.moneies.article.recyclerviewlearn.bean.AlipayIndexBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by loser's computer on 2017/7/30.
 */
public class AlipayIndexAdapter extends RecyclerView.Adapter {

    private List<AlipayIndexBean> mData;
    private Context mContext;

    /**
     * 快递：itemType -> ITEM_TYPE_EXPRESS
     * 健康-保险：itemType -> ITEM_TYPE_HEALTH_SAFE
     * 健康-关怀：itemType -> ITEM_TYPE_HEALTH_CARE
     * 支付助手：itemType -> ITEM_TYPE_ALIPAY
     * 账单：itemType -> ITEM_TYPE_BILL
     * 蚂蚁保卡：itemType -> ITEM_TYPE_CARD
     * 保险：itemType -> ITEM_TYPE_SAFE
     * 底部栏：itemType -> ITEM_TYPE_FOOTER
     * 其他：itemType -> ITEM_TYPE_OTHER
     */
    public static final int ITEM_TYPE_EXPRESS = 1;
    public static final int ITEM_TYPE_HEALTH_SAFE = 2;
    public static final int ITEM_TYPE_HEALTH_CARE = 3;
    public static final int ITEM_TYPE_ALIPAY = 4;
    public static final int ITEM_TYPE_BILL = 5;
    public static final int ITEM_TYPE_CARD = 6;
    public static final int ITEM_TYPE_SAFE = 7;
    public static final int ITEM_TYPE_OTHER = 8;
    public static final int ITEM_TYPE_FOOTER = 9;


    public AlipayIndexAdapter() {
    }

    public AlipayIndexAdapter(Context mContext) {
        this.mContext = mContext;
        mData = new ArrayList<>();
    }

    public void addData(List<AlipayIndexBean> datas){
        mData.clear();
        mData.addAll(datas);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view;
        switch (viewType) {
            case ITEM_TYPE_EXPRESS:
                break;
            case ITEM_TYPE_HEALTH_SAFE:
                break;
            case ITEM_TYPE_HEALTH_CARE:
                break;
            case ITEM_TYPE_ALIPAY:
                break;
            case ITEM_TYPE_BILL:
                break;
            case ITEM_TYPE_CARD:
                break;
            case ITEM_TYPE_SAFE:
                break;
            case ITEM_TYPE_OTHER:
                break;
            case ITEM_TYPE_FOOTER:
                break;
            default:
                return null;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case ITEM_TYPE_EXPRESS:
                break;
            case ITEM_TYPE_HEALTH_SAFE:
                break;
            case ITEM_TYPE_HEALTH_CARE:
                break;
            case ITEM_TYPE_ALIPAY:
                break;
            case ITEM_TYPE_BILL:
                break;
            case ITEM_TYPE_CARD:
                break;
            case ITEM_TYPE_SAFE:
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
                return ITEM_TYPE_EXPRESS;
            case 2:
                return ITEM_TYPE_HEALTH_SAFE;
            case 3:
                return ITEM_TYPE_HEALTH_CARE;
            case 4:
                return ITEM_TYPE_ALIPAY;
            case 5:
                return ITEM_TYPE_BILL;
            case 6:
                return ITEM_TYPE_CARD;
            case 7:
                return ITEM_TYPE_SAFE;
            case 8:
                return ITEM_TYPE_OTHER;
            case 9:
                return ITEM_TYPE_FOOTER;
            default:
                return 0;
        }
    }

    /**
     * 我的快递 ViewHolder
     */
    public class ExpressViewHolder extends RecyclerView.ViewHolder {

        public ExpressViewHolder(View itemView) {
            super(itemView);
        }
    }

    /**
     * 我的健康-保险 ViewHolder
     */
    public class HealthSafeViewHolder extends RecyclerView.ViewHolder {

        public HealthSafeViewHolder(View itemView) {
            super(itemView);
        }
    }

    /**
     * 我的健康-关怀 ViewHolder
     */
    public class HealthCareViewHolder extends RecyclerView.ViewHolder {

        public HealthCareViewHolder(View itemView) {
            super(itemView);
        }
    }

    /**
     * 支付助手 ViewHolder
     */
    public class AlipayViewHolder extends RecyclerView.ViewHolder {

        public AlipayViewHolder(View itemView) {
            super(itemView);
        }
    }

    /**
     * 支付宝账单 ViewHolder
     */
    public class BillViewHolder extends RecyclerView.ViewHolder {
        public BillViewHolder(View itemView) {
            super(itemView);
        }
    }

    /**
     * 蚂蚁宝卡 ViewHolder
     */
    public class CardViewHolder extends RecyclerView.ViewHolder {
        public CardViewHolder(View itemView) {
            super(itemView);
        }
    }


    /**
     * 账户安全保险 ViewHolder
     */
    public class SafeViewHolder extends RecyclerView.ViewHolder {
        public SafeViewHolder(View itemView) {
            super(itemView);
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

    /**
     * 其他
     */
    public class OtherViewHolder extends RecyclerView.ViewHolder {
        public OtherViewHolder(View itemView) {
            super(itemView);
        }
    }
}
