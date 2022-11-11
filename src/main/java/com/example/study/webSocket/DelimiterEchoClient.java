package com.example.study.webSocket;

import com.example.study.constant.FiveInOneReportConstant;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

@Component
public class DelimiterEchoClient {

    private static DelimiterEchoClient instance;

    public DelimiterEchoClient() {
    }

    public static DelimiterEchoClient getInstance() {
        if (instance == null) {
            instance = new DelimiterEchoClient();
            try {
                instance.start();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return instance;
    }

    protected static Logger logger = LoggerFactory.getLogger(DelimiterEchoClient.class);

    public static DelimiterClientHandler cl = new DelimiterClientHandler();

    public void start() throws InterruptedException {
        EventLoopGroup group = new NioEventLoopGroup();/*线程组*/
        try {
            final Bootstrap b = new Bootstrap();/*客户端启动必须*/
            b.group(group)/*将线程组传入*/
                    .channel(NioSocketChannel.class)/*指定使用NIO进行网络传输*/
                    .remoteAddress(new InetSocketAddress(FiveInOneReportConstant.STATIC_DATA_REPORT_IP, FiveInOneReportConstant.STATIC_DATA_REPORT_PORT))/*配置要连接服务器的ip地址和端口*/
                    .handler(new ChannelInitializerImp());
            ChannelFuture f = b.connect().sync();
            System.out.println("已连接到服务器.....");
            f.channel().closeFuture().sync();
        } finally {
            group.shutdownGracefully().sync();
        }
    }

    private static class ChannelInitializerImp extends ChannelInitializer<Channel> {
        @Override
        protected void initChannel(Channel ch) throws Exception {
            //添加间隔符编码
            ByteBuf delimiter = Unpooled.copiedBuffer(FiveInOneReportConstant.DELIMITER_SYMBOL.getBytes());
            //指定大小
            ch.pipeline().addLast(new DelimiterBasedFrameDecoder(1024 * 1024 * 2, delimiter));
            //指定相关逻辑操作
            ch.pipeline().addLast(cl);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DelimiterEchoClient.getInstance();
    }

}
