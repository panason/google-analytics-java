package com.brsanthu.googleanalytics;

import com.brsanthu.googleanalytics.request.*;

public interface GoogleAnalytics extends AutoCloseable {

    EventHit event();

    ExceptionHit exception();

    ItemHit item();

    ExtendedItemHit extendedItem();

    PageViewHit pageView();

    PageViewHit pageView(String url, String title);

    PageViewHit pageView(String url, String title, String description);

    ScreenViewHit screenView();

    ScreenViewHit screenView(String appName, String screenName);

    SocialHit social();

    SocialHit social(String socialNetwork, String socialAction, String socialTarget);

    TimingHit timing();

    TransactionHit transaction();

    GoogleAnalyticsStats getStats();

    GoogleAnalyticsConfig getConfig();

    void ifEnabled(Runnable runnable);

    void resetStats();

    static GoogleAnalyticsBuilder builder() {
        return new GoogleAnalyticsBuilder();
    }

    void flush();
}