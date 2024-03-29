package com.example.study.util;


import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;

/**
 * @Description: AES加密和解密工具类
 * @Author:杨攀
 * @Since:2019年9月16日上午11:29:35
 */
public class AESUtil {

    // AES secretKey length (must be 16 bytes)
    public static final String secretKey = "QAZWSXEDCRFVTGBH";

    // 字符串编码
    private static final String KEY_CHARSET = "UTF-8";

    // 算法方式
    private static final String KEY_ALGORITHM = "AES";

    // 算法/模式/填充
    private static final String CIPHER_ALGORITHM_CBC = "AES/CBC/PKCS5Padding";

    // 私钥大小128/192/256(bits)位 即：16/24/32bytes，暂时使用128，如果扩大需要更换java/jre里面的jar包
    private static final Integer PRIVATE_KEY_SIZE_BIT = 128;

    private static final Integer PRIVATE_KEY_SIZE_BYTE = 16;


    /**
     * @param plainText 明文：要加密的内容
     * @return 密文：加密后的内容，如有异常返回空串：""
     * @Description: 加密
     * @Author:杨攀
     * @Since: 2019年9月17日上午10:17:18
     */
    public static String encrypt(String plainText) {
        return encrypt(secretKey, plainText);
    }

    /**
     * @param secretKey 密钥：加密的规则 16位
     * @param plainText 明文：要加密的内容
     * @return cipherText 密文：加密后的内容，如有异常返回空串：""
     * @Description: 加密
     * @Author:杨攀
     * @Since: 2019年9月12日下午7:09:31
     */
    public static String encrypt(String secretKey, String plainText) {
        if (secretKey.length() != PRIVATE_KEY_SIZE_BYTE) {
            throw new RuntimeException("AESUtil:Invalid AES secretKey length (must be 16 bytes)");
        }

        // 密文字符串
        String cipherText = "";
        try {
            // 加密模式初始化参数
            Cipher cipher = initParam(secretKey, Cipher.ENCRYPT_MODE);
            // 获取加密内容的字节数组
            byte[] bytePlainText = plainText.getBytes(KEY_CHARSET);
            // 执行加密
            byte[] byteCipherText = cipher.doFinal(bytePlainText);
            cipherText = Base64.encodeBase64String(byteCipherText);
        } catch (Exception e) {
            throw new RuntimeException("AESUtil:encrypt fail!", e);
        }
        return cipherText;
    }

    /**
     * @param cipherText 密文：加密后的内容，即需要解密的内容
     * @return 明文：解密后的内容即加密前的内容，如有异常返回空串：""
     * @Description: 解密
     * @Author:杨攀
     * @Since: 2019年9月17日上午10:18:19
     */
    public static String decrypt(String cipherText) {
        return decrypt(secretKey, cipherText);
    }


    /**
     * @param secretKey 密钥：加密的规则 16位
     * @param cipherText 密文：加密后的内容，即需要解密的内容
     * @return plainText  明文：解密后的内容即加密前的内容，如有异常返回空串：""
     * @return
     * @Description: 解密
     * @Author:杨攀
     * @Since: 2019年9月12日下午7:10:06
     */
    public static String decrypt(String secretKey, String cipherText) {

        if (secretKey.length() != PRIVATE_KEY_SIZE_BYTE) {
            throw new RuntimeException("AESUtil:Invalid AES secretKey length (must be 16 bytes)");
        }

        // 明文字符串
        String plainText = "";
        try {
            Cipher cipher = initParam(secretKey, Cipher.DECRYPT_MODE);
            // 将加密并编码后的内容解码成字节数组
            byte[] byteCipherText = Base64.decodeBase64(cipherText);
            // 解密
            byte[] bytePlainText = cipher.doFinal(byteCipherText);
            plainText = new String(bytePlainText, KEY_CHARSET);
        } catch (Exception e) {
            throw new RuntimeException("AESUtil:decrypt fail!", e);
        }
        return plainText;
    }

    /**
     * 初始化参数
     *
     * @param secretKey 密钥：加密的规则 16位
     * @param mode      加密模式：加密or解密
     */
    public static Cipher initParam(String secretKey, int mode) {
        try {
            // 防止Linux下生成随机key
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(secretKey.getBytes());
            // 获取key生成器
            KeyGenerator keygen = KeyGenerator.getInstance(KEY_ALGORITHM);
            keygen.init(PRIVATE_KEY_SIZE_BIT, secureRandom);

            // 获得原始对称密钥的字节数组
            byte[] raw = secretKey.getBytes();

            // 根据字节数组生成AES内部密钥
            SecretKeySpec key = new SecretKeySpec(raw, KEY_ALGORITHM);
            // 根据指定算法"AES/CBC/PKCS5Padding"实例化密码器
            Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM_CBC);
            IvParameterSpec iv = new IvParameterSpec(secretKey.getBytes());

            // 初始化AES密码器
            cipher.init(mode, key, iv);

            return cipher;
        } catch (Exception e) {
            throw new RuntimeException("AESUtil:initParam fail!", e);
        }
    }


    public static void main(String[] args) {

        long s = System.currentTimeMillis();

        String text = "[{\"riskUnitId\":\"123456789123456789123456789123456789\",\"companyCode\":\"321210236\",\"hazardCode\":\"321210236002\",\"hazardDep\":\"2222\",\"hazardLiablePerso\":\"111\",\"riskUnitName\":\"ddsss\"}]";
        String encryptMsg = encrypt(secretKey, text);
        System.out.println("密文为：" + encryptMsg);

        long e = System.currentTimeMillis();

        System.out.println(e - s);

        String decryptMsg = decrypt(secretKey, "J/0Hli2RdhdoZGzDR1D3PAEJnHy04ny5xLUoQbpJzpWzekYuQAsnMBDwOe36DKRZk4cZOTiB0SFBkLttDxgL9cRQjf1pKCwdwHvK1WtGEVzAtDm/BNAJKsKeO8uWeoLrNamcRDEmB7XH2m4ylaRrT2jPaaiI4cys2yoyKJQ8AIZOn2bLrcGTgjvQUOGa7yTPMvujwa2AtA+wlov2cIhZfdjuccoOHnm6h/o7VN7rrDgCN19VO/ZwBExBy/w80piwheBulSgo/L7wqxLSn0GOqEfoIXsj4YRgRVvD3ZcVejPfXy1fIfMrG6DqucRYxL3hkThzde8wdErWPw/CMt7j+q6KoyMVz95olVqnq/64x8jcKBvfwKmeW6O9uhUd18Wz2n7jNDrFdC/6kUNP8e070zRPIxgulAU+daB/L5WRAQJt/tX1Qi3J9o+oe6ke0eANXM4/3QnkR1nNSZC3fEmNG7uNnkzq6eFoRPwzRAmS/vRAtuT61Y3akS6koWEFbrNRTRe0PVWidwNOOWerM6U6If7sA66BChB05K1Yb9lnST8=");
        System.out.println("明文为：" + decryptMsg);
        IvParameterSpec iv = new IvParameterSpec(secretKey.getBytes());
        System.out.println(iv);
        long d = System.currentTimeMillis();

        System.out.println(d - e);
    }

}