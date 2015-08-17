package com.example.abner.dynamicfragment.view;

/**
 * Created by Abner on 15/6/30.
 * QQ 230877476
 * Email nimengbo@gmail.com
 */
public class ContentPageItem {

    private final CharSequence mTitle;
    private final int mIndicatorColor;
    private final int mDividerColor;

    public ContentPageItem(CharSequence title, int indicatorColor, int dividerColor) {
        mTitle = title;
        mIndicatorColor = indicatorColor;
        mDividerColor = dividerColor;
    }


    /**
     * @return the title which represents this tab. In this sample this is used directly by
     * {@link android.support.v4.view.PagerAdapter#getPageTitle(int)}
     */
    CharSequence getTitle() {
        return mTitle;
    }

    /**
     * @return the color to be used for indicator on the {@link CustomSlidingTabLayout}
     */
    public int getIndicatorColor() {
        return mIndicatorColor;
    }

    /**
     * @return the color to be used for right divider on the {@link CustomSlidingTabLayout}
     */
    public int getDividerColor() {
        return mDividerColor;
    }
}
