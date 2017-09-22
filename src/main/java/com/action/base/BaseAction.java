package com.action.base;

import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class BaseAction extends ActionSupport {

    /**
     * 解析json请求数据
     * 此方法用于没有使用struts2-json-plugin场景
     *
     * @param request 请求
     * @return
     * @throws IOException
     */
    protected String parseReqJsonData(HttpServletRequest request) throws IOException {

        String contentType = request.getContentType();
        if (contentType.equals("application/json")) {
            int contentLength = request.getContentLength();
            if (contentLength < 0) {
                return null;
            }
            byte buffer[] = new byte[contentLength];
            for (int i = 0; i < contentLength; ) {
                int len = request.getInputStream().read(buffer, i, contentLength - i);
                if (len == -1) {
                    break;
                }
                i += len;
            }
            return new String(buffer, "utf-8");
        }
        return null;
    }
}
