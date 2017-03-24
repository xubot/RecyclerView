package com.example.administrator.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/3/23.
 */

public class MasonryAdapter extends RecyclerView.Adapter<MasonryAdapter.MasonryView>{
    private List<Product> products;


    public MasonryAdapter(List<Product> list) {
        products=list;
    }

    @Override
    //得到布局文件的方法
    public MasonryView onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.masonry_item, viewGroup, false);
        return new MasonryView(view);
    }

    @Override
    //参数一： 项目在给定位置的数据集。（得到控件）
    //参数二：他项目的位置在适配器的数据集（每一个角标）
    //赋值的方法
    public void onBindViewHolder(MasonryView masonryView, int position) {
        masonryView.imageView.setImageResource(products.get(position).getImg());
        masonryView.textView.setText(products.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    //得到控件的内部类继承RecyclerView里面的控件持有者
    public static class MasonryView extends  RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView;

        public MasonryView(View itemView){
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.masonry_item_img );
            textView= (TextView) itemView.findViewById(R.id.masonry_item_title);
        }

    }

}
