package com.example.administrator.recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2017/3/23.
 */
//ItemDecoration   RecyclerView里的条目装饰
public class SpacesItemDecoration extends RecyclerView.ItemDecoration{
    private int space;

    public SpacesItemDecoration(int space) {
        this.space=space;
    }

    @Override
    //参数一：矩形接收输出。
    //参数二：要装饰的视图
    //参数三：RecyclerView 条目装饰
    //参数四：RecyclerView的当前状态。
    //得到条目离开当前位置的设置的方法
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left=space;
        outRect.right=space;
        outRect.bottom=space;
        if(parent.getChildAdapterPosition(view)==0){
            outRect.top=space;
        }
    }
}
