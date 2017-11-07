package com.ycm.kata.wxdiray.view.adapter;

import android.app.Activity;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ycm.kata.wxdiray.R;
import com.ycm.kata.wxdiray.presenter.bean.Article;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by changmuyu on 2017/10/30.
 * Description: 轮播图的适配器
 */
public class LoopViewPagerAdapter extends BaseLoopPagerAdapter {
    private final List<Article> articleList;
    private int mLastPosition;
    private Activity activity;

    //    private OnItemClickListener onItemClickListener;
    public LoopViewPagerAdapter(ViewPager viewPager, Activity activity) {
        super(viewPager);
        articleList = new ArrayList<>();
        this.activity = activity;
    }

    public void setList(List<Article> focusPictures) {
        this.articleList.clear();
        this.articleList.addAll(focusPictures);
        notifyDataSetChanged();
    }

    @Override
    public void notifyDataSetChanged() {
//        initIndicators();
        super.notifyDataSetChanged();
    }

    @Override
    public int getPagerCount() {
        return articleList.size();
    }

    @Override
    public Article getItem(int position) {
        return articleList.get(position);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_article_card, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvContent.setText(articleList.get(position).getContent());
        Glide.with(activity).load(articleList.get(position).getImagePath()).into(holder.ivPic);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                onItemClickListener.onHeaderItemClick(position, articleList.get(position));
            }
        });
        return convertView;
    }

    @Override
    public void onPageItemSelected(int position) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//            mIndicators.getChildAt(mLastPosition).setActivated(false);
//            mIndicators.getChildAt(position).setActivated(true);
        }
        mLastPosition = position;
    }

    public static class ViewHolder {
        ImageView ivPic;
        TextView tvContent;

        ViewHolder(View convertView) {
            ivPic = convertView.findViewById(R.id.iv_image);
            tvContent = convertView.findViewById(R.id.tv_content);
        }
    }

    private int getPixelsFromDp(int size) {
        DisplayMetrics metrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return (size * metrics.densityDpi) / DisplayMetrics.DENSITY_DEFAULT;
    }

//    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
//        this.onItemClickListener = onItemClickListener;
//    }
}
