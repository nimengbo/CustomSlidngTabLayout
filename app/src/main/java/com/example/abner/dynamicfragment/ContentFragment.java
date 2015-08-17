package com.example.abner.dynamicfragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abner.dynamicfragment.model.ContentModel;

/**
 * Created by Abner on 15/8/6.
 * QQ 230877476
 * Email nimengbo@gmail.com
 */
public class ContentFragment extends Fragment {
    private static final String KEY_MODEL = "key_model";

    private View thisFragment;

    /**
     * @return a new instance of {@link ContentFragment}, adding the parameters into a bundle and
     * setting them as arguments.
     */

    public static ContentFragment newInstance(ContentModel model) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(KEY_MODEL,model);
        ContentFragment fragment = new ContentFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        if (thisFragment == null) {
            thisFragment = inflater.inflate(R.layout.pager_item, null);
            initView();
        } else {
            // 从parent删除
            ViewGroup parent = (ViewGroup) thisFragment.getParent();
            if (parent != null) {
                parent.removeView(thisFragment);
            }
        }
        return thisFragment;
    }

    private void initView(){
        Bundle args = getArguments();
        ContentModel model = (ContentModel)args.getSerializable(KEY_MODEL);
        if (model != null) {
            TextView title = (TextView) thisFragment.findViewById(R.id.item_title);
            title.setText(model.getContent());
        }
    }
}
