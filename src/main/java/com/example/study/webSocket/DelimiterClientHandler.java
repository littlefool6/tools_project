package com.example.study.webSocket;

import com.example.study.constant.FiveInOneReportConstant;
import com.example.study.service.FiveInOneReportService;
import com.example.study.util.SpringContextHolder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@ChannelHandler.Sharable
public class DelimiterClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    protected static Logger logger = LoggerFactory.getLogger(DelimiterClientHandler.class);

    private final AtomicInteger counter = new AtomicInteger(0);

    public static ChannelHandlerContext ctx;

    /*** 客户端读取到网络数据后的处理*/
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws InterruptedException {
        String info = msg.toString(CharsetUtil.UTF_8);
//        System.out.println("client Accept[" + info + "] and the counter is:" + counter.incrementAndGet());
        logger.info("client Accept[" + info + "] and the counter is:" + counter.incrementAndGet());
        ctx.close();
    }

    /*** 客户端被通知channel活跃后，做事*/
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        FiveInOneReportService fiveInOneReportService = SpringContextHolder.getBean(FiveInOneReportService.class);
//        fiveInOneReportService.reportWC_ENT_LEAKPOINT(ctx);
//        fiveInOneReportService.reportWC_ENT_PROMISE(ctx);
//        fiveInOneReportService.reportWC_ENT_QYCN(ctx);
//        fiveInOneReportService.reportWC_PROD_HIS(ctx);
//        fiveInOneReportService.reportWC_ENT_SBJZ(ctx);
//        fiveInOneReportService.downloadWC_WARN_RESULT(ctx);
        fiveInOneReportService.reportWC_ENT_CGQ(ctx);
//        fiveInOneReportService.reportWC_ENT_TASK(ctx);
//        fiveInOneReportService.reportWC_ENT_SAFE_TARGET(ctx);
//        fiveInOneReportService.reportWC_ENT_TARGET_RESOLVE(ctx);
//        fiveInOneReportService.reportWC_ENT_TARGET_EAXM(ctx);
//        fiveInOneReportService.reportWC_ENT_ALARM_VEHICLE(ctx);
//        fiveInOneReportService.reportWC_ENT_ALARM_FOREGIN(ctx);
//        fiveInOneReportService.reportWC_ENT_ALARM_REGIONAL(ctx);
//        fiveInOneReportService.reportWC_ENT_RESERVEPLAN(ctx);
//        fiveInOneReportService.reportWC_ENT_DRILL(ctx);
//        fiveInOneReportService.reportWC_ENT_FXDJ(ctx);
//        fiveInOneReportService.reportWC_ENT_FXGK(ctx);
//        fiveInOneReportService.reportWC_ENT_PR_PXTRAIN(ctx);
//        fiveInOneReportService.reportWC_ENT_PR_PXHD(ctx);
//        fiveInOneReportService.reportWC_ENT_PR_YHZG(ctx);
//        fiveInOneReportService.reportWC_ENT_PR_YHZGTZ(ctx);
//        fiveInOneReportService.reportWC_ENT_LOGINSTATUS(ctx);
//        fiveInOneReportService.reportWC_ENT_MATERIAL(ctx);
        ctx.flush();
    }

    /*** 发生异常后的处理*/
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    public static String sendMessage(String message) throws InterruptedException {
        ctx.write(message).sync();
        return "OK";
    }

}
