package com.xulu.common.util;

import com.xulu.common.dto.ImageCode;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * @author xulu
 * @date 2018/8/27
 * @link https://github.com/xulu163
 */
public class ImageCodeUtil {

    public static char[] codeSequence = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    /**
     * 生成图形验证码
     * @return
     */
    public static ImageCode createImageCode(){
        ImageCode imageCode = new ImageCode();
        // 在内存中创建图象
        int width = 65, height = 20;
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        // 获取图形上下文
        Graphics go = image.getGraphics();
        Graphics2D g = (Graphics2D)go;
        // 生成随机类
        Random random = new Random();

        // 设定背景色
        g.setColor(getRandColor(230, 255));
        g.fillRect(0, 0, 65, 20);
        // 设定字体
        g.setFont(new Font("宋体,Arial", Font.CENTER_BASELINE | Font.ITALIC , 16));
        // 产生0条干扰线，
        g.drawLine(1, 0, 1, 0);
        // 取随机产生的认证码(4位数字)
        String sRand = "";
        for (int i = 0; i < 4; i++) {
            String strRand = String.valueOf(codeSequence[random.nextInt(10)]);
            sRand += strRand;
            // 将认证码显示到图象中
            g.rotate(1 * Math.PI / 180);
            g.setColor(getRandColor(100, 150));// 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
            g.drawString(strRand, 9 * i+8, 16);
        }
        // 图象生效
        g.dispose();
        imageCode.setImage(image);
        imageCode.setsRand(sRand);
        return imageCode;
    }
    /**
     * 给定范围获得随机颜色
     */
    public static Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255)
            fc = 255;
        if (bc > 255)
            bc = 255;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }
}
