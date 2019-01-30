/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.brsanthu.googleanalytics.request;

import java.util.HashMap;
import java.util.Map;

import static com.brsanthu.googleanalytics.internal.Constants.HIT_EXTENDED_ITEM;
import static com.brsanthu.googleanalytics.internal.Constants.HIT_ITEM;
import static com.brsanthu.googleanalytics.request.GoogleAnalyticsParameter.*;

/**
 * @author apanasovich
 */
public class ExtendedItemHit extends GoogleAnalyticsRequest<ExtendedItemHit> {


    public ExtendedItemHit() {
        super(HIT_EXTENDED_ITEM);
    }


    public ExtendedItemHit extendedItemAction(String value) {
        setString(EXTENDED_ITEM_ACTION, value);
        return this;
    }

    public String extendedItemAction() {
        return getString(EXTENDED_ITEM_ACTION);
    }


    public ExtendedItemHit extendedItemCode(int index, String value) {
        setIndexString(index, EXTENDED_ITEM_CODE, value);
        return this;
    }

    public String extendedItemCode(int index) {
        return getIndexString(index, EXTENDED_ITEM_CODE);
    }


    public ExtendedItemHit extendedItemName(int index, String value) {
        setIndexString(index, EXTENDED_ITEM_NAME, value);
        return this;
    }

    public String extendedItemName(int index) {
        return getIndexString(index, EXTENDED_ITEM_NAME);
    }

    public ExtendedItemHit extendedItemBrand(int index, String value) {
        setIndexString(index, EXTENDED_ITEM_BRAND, value);
        return this;
    }

    public String extendedItemBrand(int index) {
        return getIndexString(index, EXTENDED_ITEM_BRAND);
    }

    public ExtendedItemHit extendedItemCategory(int index, String value) {
        setIndexString(index, EXTENDED_ITEM_CATEGORY, value);
        return this;
    }

    public String extendedItemCategory(int index) {
        return getIndexString(index, EXTENDED_ITEM_CATEGORY);
    }

    public ExtendedItemHit extendedItemKind(int index, String value) {
        setIndexString(index, EXTENDED_ITEM_KIND, value);
        return this;
    }

    public String extendedItemKind(int index) {
        return getIndexString(index, EXTENDED_ITEM_KIND);
    }

    public ExtendedItemHit extendedItemPrice(int index, Double value) {
        setIndexDouble(index, EXTENDED_ITEM_PRICE, value);
        return this;
    }

    public Double extendedItemPrice(int index) {
        return getIndexDouble(index, EXTENDED_ITEM_PRICE);
    }


    public ExtendedItemHit extendedItemQuantity(int index, Integer value) {
        setIndexInteger(index,EXTENDED_ITEM_QUANTITY, value);
        return this;
    }

    public Integer extendedItemQuantity(int index) {
        return getIndexInteger(index,EXTENDED_ITEM_QUANTITY);
    }


    public ExtendedItemHit extendedItemCouponCode(int index, String value) {
        setIndexString(index, EXTENDED_ITEM_COUPON_CODE, value);
        return this;
    }

    public String extendedItemCouponCode(int index) {
        return getIndexString(index, EXTENDED_ITEM_COUPON_CODE);
    }


    public ExtendedItemHit extendedItemIndex(int index, Integer value) {
        setInteger(EXTENDED_ITEM_INDEX, value);
        return this;
    }

    public Integer extendedItemIndex(int index) {
        return getInteger(EXTENDED_ITEM_INDEX);
    }


    public ExtendedItemHit extendedItemCustomDimension(int index, String value, int dimensionIndex) {
        setIndexString(index, EXTENDED_ITEM_CUSTOM_DIMENSION, value, dimensionIndex, false);
        return this;
    }


    public String extendedItemCustomDimension(int index, int dimensionIndex) {
        return getIndexString(index, EXTENDED_ITEM_CUSTOM_DIMENSION, dimensionIndex, false);
    }


    public ExtendedItemHit extendedItemCustomMetric(int index, String value, int metricIndex) {
        setIndexString(index, EXTENDED_ITEM_CUSTOM_DIMENSION, value, metricIndex, true);
        return this;
    }


    public String extendedItemCustomMetric(int index, int metricIndex) {
        return getIndexString(index, EXTENDED_ITEM_CUSTOM_DIMENSION, metricIndex, true);
    }


    protected ExtendedItemHit setIndexString(int index, GoogleAnalyticsParameter parameter, String value) {
        String key = getIndexKey(index, parameter);
        return putParam(key,value);
    }


    protected ExtendedItemHit setIndexString(int index, GoogleAnalyticsParameter parameter, String value, int secondIndex, boolean metric) {
        String key = getIndexKey(index, parameter, secondIndex, metric);
        return putParam(key,value);
    }


    private ExtendedItemHit putParam(String key,String value) {
        if (value == null) {
            extendedCommerceParams.remove(key);
        } else {
            String stringValue = value;
            extendedCommerceParams.put(key, stringValue);
        }
        return this;
    }


    private String getIndexKey(int index, GoogleAnalyticsParameter parameter) {
        return parameter.getParameterName().replace("<productIndex>", "" + index);
    }


    private String getIndexKey(int index, GoogleAnalyticsParameter parameter, int secondIndex, boolean metric) {
        return parameter.getParameterName().replace("<productIndex>", "" + index).replace(metric ? "<metricIndex>" : "<dimensionIndex>", "" + secondIndex);
    }

    protected String getIndexString(int index, GoogleAnalyticsParameter parameter) {
        String key = getIndexKey(index, parameter);
        return extendedCommerceParams.get(key);
    }

    protected String getIndexString(int index, GoogleAnalyticsParameter parameter, int secondIndex, boolean metric) {
        String key = getIndexKey(index, parameter, secondIndex, metric);
        return extendedCommerceParams.get(key);
    }


    protected ExtendedItemHit setIndexDouble(int index, GoogleAnalyticsParameter parameter, Double value) {
        String key = getIndexKey(index, parameter);
        if (value == null) {
            extendedCommerceParams.remove(key);
        } else {
            String stringValue = fromDouble(value);
            extendedCommerceParams.put(key, stringValue);
        }
        return this;
    }

    protected Double getIndexDouble(int index, GoogleAnalyticsParameter parameter) {
        String key = getIndexKey(index, parameter);
        return toDouble(extendedCommerceParams.get(key));
    }


    protected ExtendedItemHit setIndexInteger(int index, GoogleAnalyticsParameter parameter, Integer value) {
        String key = getIndexKey(index, parameter);
        if (value == null) {
            extendedCommerceParams.remove(key);
        } else {
            String stringValue = fromInteger(value);
            extendedCommerceParams.put(key, stringValue);
        }
        return this;
    }

    protected Integer getIndexInteger(int index, GoogleAnalyticsParameter parameter) {
        String key = getIndexKey(index, parameter);
        return toInteger(parms.get(key));
    }

}
