package com.features.moneies.article.recyclerviewlearn.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.features.moneies.article.recyclerviewlearn.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by loser's computer on 2017/6/7.
 */
public class GridManagerAdapter extends RecyclerView.Adapter<GridManagerAdapter.ViewHolder> {

    private List<String> mData;
    private Context mContext;
    private int orientation;

    public GridManagerAdapter() {
    }

    public GridManagerAdapter(Context mContext, int orientation) {
        this.mContext = mContext;
        this.orientation = orientation;
        mData = new ArrayList<>();
    }

    public void addData(List<String> data) {
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }

    public void addData(String data) {
        mData.add(data);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /*
            1 -> 当布局管理器的方向为横向时，itemView的高度为wrap_content,宽度wrap_content时和设置纵向是没区别，
                 只有当宽度设置为math_parent才能明显体现出设置的方向。
            2 -> 当布局管理器的方向为纵向时，itemView的宽度为math_parent,高度wrap_content / math_parent都可以
         */
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_common_manager,null);
        if (orientation == 1){
            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            itemView.setLayoutParams(params);
        }else {
            LinearLayout.LayoutParams params =
                    new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.gravity = Gravity.CENTER;
            itemView.setLayoutParams(params);
        }
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.itemText.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_img)
        ImageView itemImg;
        @BindView(R.id.item_text)
        TextView itemText;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
