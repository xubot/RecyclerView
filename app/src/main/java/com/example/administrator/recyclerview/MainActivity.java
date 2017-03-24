package com.example.administrator.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recycler);
        //设置layoutManager
        //setLayoutManager 设置布局管理
        //StaggeredGridLayoutManager   错乱的网格布局管理
        //参数一： 要显示的行数和列数
        //参数二：是设置错乱布局管理的横向还是列向
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        //设置初始值
        initData();
        //设置适配器
        MasonryAdapter adapter=new MasonryAdapter(productList);
        recyclerView.setAdapter(adapter);
        //设置item之间的间隔
        //得到条目的装饰对象
        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        //给控件添加条目装饰
        recyclerView.addItemDecoration(decoration);
    }
    private void initData() {
        productList = new ArrayList<Product>();
        Product p1 = new Product(R.drawable.ccc, "我是照片1");
        productList.add(p1);
        Product p2 = new Product(R.drawable.five, "我是照片2");
        productList.add(p2);
        Product p3 = new Product(R.drawable.frou, "我是照片3");
        productList.add(p3);
        Product p4 = new Product(R.drawable.noet, "我是照片4");
        productList.add(p4);
        Product p5 = new Product(R.drawable.one, "我是照片5");
        productList.add(p5);
        Product p6 = new Product(R.drawable.three, "我是照片6");
        productList.add(p6);
        Product p7 = new Product(R.drawable.touxiang, "我是照片7");
        productList.add(p7);
        Product p8 = new Product(R.drawable.twe, "我是照片8");
        productList.add(p8);
        Product p9 = new Product(R.drawable.yy, "我是照片9");
        productList.add(p9);
        Product p10 = new Product(R.drawable.u0015zsqnhu_ori_1, "我是照片10");
        productList.add(p10);
    }
}
