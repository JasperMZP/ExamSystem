package com.bjtu.examsys.utils;


import com.google.gson.Gson;

/*
 * 封装的GSON解析工具类，提供泛型参数
 */
public class GsonUtil {
    // 将Json数据解析成相应的映射对象
    public static <T> T parseJsonWithGson(String jsonData, Class<T> type) {
        Gson gson = new Gson();
        T result = gson.fromJson(jsonData, type);
        return result;
    }

}