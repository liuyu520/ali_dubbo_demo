package com.test.filter;

import com.alibaba.dubbo.rpc.*;

public class ResponseDemoFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        // before filter ...
        Result result = invoker.invoke(invocation);
        System.out.println("自定义过滤器 ResponseDemoFilter :" + result.getValue());
        // after filter ...
        return result;
    }
}
