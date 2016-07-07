package com.example.nikeru8.pageview;

/**
 * Created by nikeru8 on 2016/7/3.
 */


        import android.support.v4.view.PagerAdapter;
        import android.view.View;
        import android.view.ViewGroup;

        import java.util.List;

/**
 * Created by TP1606008 on 2016/6/23.
 */
public class MyPageAdapter extends PagerAdapter {
    List<View> list;

// public MyPageAdapter(FragmentManager fm,List<View> list) {
// super(fm);
// this.list=list;
// }
//
//
//
//
// @Override
// public Fragment getItem(int position) {
// return null;
// }
//
// @Override
// public int getCount() {
// return 0;
// }


    public MyPageAdapter(List<View> list) {
        this.list = list;
    }

    //頁面卡數量
    @Override
    public int getCount() {
        return list.size();
    }

    //????
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;

    }
    //删除页卡
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub
        container.removeView((View) list.get(position));//删除页卡
    }

    //實體化
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // TODO Auto-generated method stub
        container.addView((View) list.get(position));
        return list.get(position);
    }
}