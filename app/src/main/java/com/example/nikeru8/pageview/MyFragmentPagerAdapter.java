package com.example.nikeru8.pageview;

/**
 * Created by nikeru8 on 2016/7/3.
 */
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;

        import java.util.List;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    private Fragment[] fragments;


// 如果是用FragmentPagerAdapter，就不用override這註解掉的方法
// public MyFragmentPagerAdapter(FragmentManager fm,List<Fragment> list) {
// super(fm);
// this.list=list;
// }
//
//
// @Override
// public Fragment getItem(int position) {
// return list.get(position);
// }
//
// @Override
// public int getCount() {
// return list.size();
// }


    public MyFragmentPagerAdapter(FragmentManager fm,Fragment[] fragments) {
        super(fm);
        this.fragments=fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

// //????
// @Override
// public boolean isViewFromObject(View view, Object object) {
// return view==object;
//
// }
//
// //删除页卡
// @Override
// public void destroyItem(ViewGroup container, int position, Object object) {
// super.destroyItem(container, position, object);
// }
//
// //實體化
// @Override
// public Object instantiateItem(ViewGroup container, int position) {
// return super.instantiateItem(container, position);
// }


}