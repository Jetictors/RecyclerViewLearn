package com.features.moneies.article.recyclerviewlearn.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.features.moneies.article.recyclerviewlearn.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by loser's computer on 2017/6/7.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    private List<String> mData;
    private Context mContext;
    private OnItemClickListener mClickListener;

    public MainAdapter() {
    }

    public MainAdapter(Context mContext) {
        this.mContext = mContext;
        mData = new ArrayList<>();
    }

    public void addData(List<String> data){
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }

    public void addData(String data){
        mData.add(data);
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener mClickListener){
        this.mClickListener = mClickListener;
    }

    private OnItemClickListener getOnItemClickListener(){
        return mClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_main,parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.mainItemText.setText(mData.get(position));
        holder.itemView.setOnClickListener(v -> {
            if (null != getOnItemClickListener()){
                mClickListener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mainItemText;

        public ViewHolder(View itemView) {
            super(itemView);
            mainItemText = (TextView) itemView.findViewById(R.id.main_item_text);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(int position);
    }
}
