# CustomSlidngTabLayout

修改自https://github.com/nispok/slidingtabs

主要把一些常用的属性抽离出来了

## 效果如图

![image](/device-2015-08-17-162132.png)


以下是自定义属性

```xml

<declare-styleable name="SlidingTabLayout">
    <attr name="defaultTextColor" format="color"/>
    <attr name="selectedTextColor" format="color"/>
    <attr name="shouldExpand" format="boolean"/>
    <attr name="textSize" format="dimension"/>
    <attr name="IndicatorHeight" format="dimension"/>
    <attr name="BottomLineHeight" format="dimension"/>
    <attr name="BottomLineColor" format="color"/>
    <attr name="needBold" format="boolean"/>
</declare-styleable>

```
自定义属性使用方法

```xml

<com.example.abner.dynamicfragment.view.SlidingTabLayout
    android:id="@+id/sliding_tabs"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="@color/grey_f1f1f1"
    app:defaultTextColor="@color/grey_8b8b8b"
    app:BottomLineColor="@color/grey_cccccc"
    app:BottomLineHeight="1px"
    app:IndicatorHeight="2dp"
    app:selectedTextColor="@color/red_e73a3d"
    app:textSize="15sp"
    app:shouldExpand="false"
    app:needBold="false"
    />

```

也可以在java中可以如下配置

```java

public void setTextSize(int mTextSize) {
    this.mTextSize = mTextSize;
}

public void setBottomLineColor(int color) {
    mTabStrip.setDefaultBottomBorderColor(color);
}

public void setShouldExpand(boolean b) {
    mShouldExpand = b;
}

//set bottom line height
public void setBottomHeight(int height) {
    mTabStrip.setBottomBorderThickness(height);
}

// set bottom indicator height
public void setIndicatorHeight(int height) {
    mTabStrip.setSelectedIndicatorThickness(height);
}

public void setDTextColor(int defaultTextColor) {
    this.dTextColor = defaultTextColor;
}

public void setSTextColor(int selectedTextColor) {
    this.sTextColor = selectedTextColor;
}

```
__如果还有另外的需求，可以在源代码中修改__
