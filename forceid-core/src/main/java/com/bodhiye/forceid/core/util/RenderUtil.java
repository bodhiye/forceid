package com.bodhiye.forceid.core.util;

import com.alibaba.fastjson.JSON;
import com.bodhiye.forceid.core.exception.ForceidException;
import com.bodhiye.forceid.core.exception.ForceidExceptionEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 渲染工具类
 *
 * @author bodhiye
 * @Date 2018-08-25 14:13
 */
public class RenderUtil {

    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException e) {
            throw new ForceidException(ForceidExceptionEnum.WRITE_ERROR);
        }
    }
}
