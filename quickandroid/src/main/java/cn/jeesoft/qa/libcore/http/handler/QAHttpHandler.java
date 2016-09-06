package cn.jeesoft.qa.libcore.http.handler;

import com.squareup.okhttp.Response;

/**
 * HTTP数据处理器
 */
public interface QAHttpHandler<T> {

    T handlerResponse(Response response) throws Exception;

}
