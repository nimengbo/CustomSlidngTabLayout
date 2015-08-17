package com.example.abner.dynamicfragment;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.example.abner.dynamicfragment.view.ContentFragmentPageAdapter;
import com.example.abner.dynamicfragment.view.ContentPageItem;
import com.example.abner.dynamicfragment.view.CustomSlidingTabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private CustomSlidingTabLayout mCustomSlidingTabLayout;

    /**
     * A {@link ViewPager} which will be used in conjunction with the {@link CustomSlidingTabLayout} above.
     */
    private ViewPager mViewPager;

    /**
     * List of {@link ContentPageItem} which represent this sample's tabs.
     */
    private List<ContentPageItem> mTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        mTabs = new ArrayList<>();
        String[] strs = {"蒙版","蒙版哈哈哈哈","蒙版哈","蒙版呵呵呵呵呵呵呵呵呵","蒙版","蒙版哈哈哈哈","蒙版哈","蒙版呵呵呵呵呵呵呵呵呵","蒙版","蒙版哈哈哈哈","蒙版哈","蒙版呵呵呵呵呵呵呵呵呵"};
        for(int i = 0 ; i < 11 ; i++){
            mTabs.add(new ContentPageItem(
                    strs[i], // Title
                    getResources().getColor(R.color.red_e73a3d), // Indicator color
                    Color.TRANSPARENT // Divider color
            ));
        }



        // BEGIN_INCLUDE (setup_viewpager)
        // Get the ViewPager and set it's PagerAdapter so that it can display items
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(new ContentFragmentPageAdapter(getSupportFragmentManager(), mTabs));
        // END_INCLUDE (setup_viewpager)

        // BEGIN_INCLUDE (setup_slidingtablayout)
        // Give the SlidingTabLayout the ViewPager, this must be done AFTER the ViewPager has had
        // it's PagerAdapter set.
        mCustomSlidingTabLayout = (CustomSlidingTabLayout) findViewById(R.id.sliding_tabs);
        // setIndicatorHeight
//        mSlidingTabLayout.setIndicatorHeight(dip2px(this, 4));
//        // setBottomHeight
//        mSlidingTabLayout.setBottomHeight(0);
        mCustomSlidingTabLayout.setViewPager(mViewPager);
        // BEGIN_INCLUDE (tab_colorizer)
        // Set a TabColorizer to customize the indicator and divider colors. Here we just retrieve
        // the tab at the position, and return it's set color
        mCustomSlidingTabLayout.setCustomTabColorizer(new CustomSlidingTabLayout.TabColorizer() {

            @Override
            public int getIndicatorColor(int position) {
                return mTabs.get(position).getIndicatorColor();
            }

            @Override
            public int getDividerColor(int position) {
                return mTabs.get(position).getDividerColor();
            }

        });
        // END_INCLUDE (tab_colorizer)
        // END_INCLUDE (setup_slidingtablayout)
    }
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
