package com.mycompany;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wanghao
 * @version v1
 * @github (https : / / github.com / wanghao229)
 * @blog (https : / / www.cnblogs.com / wanghao229)
 * @summary
 * @copyright (c) 2020,  All Rights Reserved.
 * @since 2020/5/24 17:40
 */
public class TestOOM {

    private static List<Object> list = new ArrayList<>();
    public static void main(String[] args) {
        testSoftReference();
    }
    private static void testSoftReference() {
        byte[] buff = null;

        for (int i = 0; i < 10; i++) {
            buff = new byte[1024 * 1024];
            SoftReference<byte[]> sr = new SoftReference<>(buff);
            list.add(sr);
        }

        System.gc(); //主动通知垃圾回收

        for(int i=0; i < list.size(); i++){
            Object obj = ((SoftReference) list.get(i)).get();
            System.out.println(obj);
        }

        System.out.println("buff: " + buff.toString());
    }


    public static void main1(String[] args) {
        testStrongReference();
    }
    private static void testStrongReference() {
        // 当 new byte为 1M 时，程序运行正常
        byte[] buff = new byte[1024 * 1024 * 3];
    }
}
