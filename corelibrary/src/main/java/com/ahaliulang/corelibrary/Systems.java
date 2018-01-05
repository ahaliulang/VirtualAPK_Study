package com.ahaliulang.corelibrary;

import android.content.Context;

/**
 * Created by Administrator on 2018/1/5.
 */

public class Systems {
    static Context sHostContext;

    /**
     * 获取宿主的 Context
     * @return
     */
    public static Context getContext(){
        return sHostContext;
    }
}
