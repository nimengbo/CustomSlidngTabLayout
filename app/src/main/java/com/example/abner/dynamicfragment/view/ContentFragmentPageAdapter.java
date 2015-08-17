package com.example.abner.dynamicfragment.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.util.Log;

import com.example.abner.dynamicfragment.ContentFragment;
import com.example.abner.dynamicfragment.model.ContentModel;

import java.util.List;


/**
 * Created by Abner on 15/6/30.
 * QQ 230877476
 * Email nimengbo@gmail.com
 */
public class ContentFragmentPageAdapter extends FragmentPagerAdapter {

    private List<ContentPageItem> mTabs;

    public ContentFragmentPageAdapter(FragmentManager fm, List<ContentPageItem> tabs) {
        super(fm);
        mTabs = tabs;
    }

    /**
     * Return the {@link android.support.v4.app.Fragment} to be displayed at {@code position}.
     * <p/>
     */
    @Override
    public Fragment getItem(int i) {
        Log.d("ContentFragment", "getItem " + i);
        ContentModel model = new ContentModel();
        model.setPostion(i);
        model.setContent(mTabs.get(i).getTitle().toString());
        return ContentFragment.newInstance(model);
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }

    // BEGIN_INCLUDE (pageradapter_getpagetitle)

    /**
     * Return the title of the item at {@code position}. This is important as what this method
     * returns is what is displayed in the {@link SlidingTabLayout}.
     * <p/>
     * Here we return the value returned from {@link ContentPageItem#getTitle()}.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs.get(position).getTitle();
    }
    // END_INCLUDE (pageradapter_getpagetitle)

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }
}
