package nova.xiaoju.com.androidnovaautolayouttest;

import android.os.Bundle;
import android.support.annotation.Nullable;

import nova.xiaoju.com.novaautolayout.AutoLayoutActivity;

/**
 * Created by supengchao on 2016/3/4.
 */
public class TestActivity extends AutoLayoutActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test);
    }
}
