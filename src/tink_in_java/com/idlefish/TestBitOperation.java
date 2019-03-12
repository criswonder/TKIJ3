package com.idlefish;

/**
 * Created by hongyun
 * on 05/06/2018
 */
public class TestBitOperation {
    public static void main(String[] args) {
        int align = 128;//128字节对齐
        int width = 720;
        int mPixelStride = 4;

        int rowStride = 0;

        width = 1080;
        rowStride = (width * mPixelStride + (align - 1)) & ~(align - 1);
        System.out.println(rowStride + ",width x 4=" + width * mPixelStride);

        rowStride = (width * mPixelStride + (align - 1)) & ~(align - 1);
        System.out.println(rowStride + ",width x 4=" + width * mPixelStride);
    }
}
