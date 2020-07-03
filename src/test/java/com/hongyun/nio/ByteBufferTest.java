package com.hongyun.nio;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteBufferTest {
    @Test
    public void testByteBuffer() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byte b1 = 0x1;
        byte b2 = 0x2;
        byte b3 = 0x3;

        byteBuffer.put(b1);
        byteBuffer.put(b2);
        byteBuffer.put(b3);

        byteBuffer.position(0);
        System.out.println("position=" + byteBuffer.position());


        byte[] dst = new byte[2];
        byteBuffer.get(dst);

        for (int i = 0; i < dst.length; i++) {
            System.out.println(String.format("%d=%d", i, dst[i]));
        }

        //这里的flip是轻弹的意思
        byteBuffer.flip();
//        byteBuffer.position(0);
        System.out.println("position=" + byteBuffer.position());

        dst = new byte[2];
        byteBuffer.get(dst);

        for (int i = 0; i < dst.length; i++) {
            System.out.println(String.format("%d=%d", i, dst[i]));
        }

    }

    @Test
    public void testMix() {
        ByteBuffer buf = ByteBuffer.allocateDirect(1024).order(ByteOrder.LITTLE_ENDIAN);
        System.out.println(buf.remaining());
        System.out.println(buf.limit());
        System.out.println(buf.position());
    }

    @Test
    public void testRemaining() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(3);
        byte b1 = 0x1;
        byte b2 = 0x2;
        byte b3 = 0x3;

        byteBuffer.put(b1);
        byteBuffer.put(b2);
        byteBuffer.put(b3);

        System.out.println("position=" + byteBuffer.position());
        byteBuffer.position(0);

        System.out.println("limit=" + byteBuffer.limit());
        System.out.println("remaining=" + byteBuffer.remaining());
    }
}
