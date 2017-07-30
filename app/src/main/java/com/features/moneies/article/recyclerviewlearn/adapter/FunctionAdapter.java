package com.features.moneies.article.recyclerviewlearn.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.features.moneies.article.recyclerviewlearn.R;
import com.features.moneies.article.recyclerviewlearn.bean.FunctionItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by loser's computer on 2017/7/30.
 */
public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.ViewHolder> {

    private Context mContext;
    private List<FunctionItem> mData;
    private OnItemClickListener mListener;

    public FunctionAdapter() {
    }

    public FunctionAdapter(Context mContext) {
        this.mContext = mContext;
        mData = new ArrayList<>();
    }

    public void addData(List<FunctionItem> datas) {
        mData.clear();
        mData.addAll(datas);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_function, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemFunctionIcon.setImageResource(mData.get(position).getResId());
        holder.itemFunctionText.setText(mData.get(position).getText());

        holder.itemView.setOnClickListener(v -> {
            if (null != getOnItemClickListener()){
                getOnItemClickListener().onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setOnItemClickListener(OnItemClickListener mListener){
        this.mListener = mListener;
    }

    public OnItemClickListener getOnItemClickListener(){
        return this.mListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.item_function_icon)
        ImageView itemFunctionIcon;
        @BindView(R.id.item_function_text)
        TextView itemFunctionText;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }
}
