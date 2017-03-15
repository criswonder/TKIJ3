package com.idlefish;


import org.junit.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertSame;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by hongyun
 * on 15/03/2017
 *
 * http://blog.csdn.net/mxbhxx/article/details/9111711
 */

public class WeakSoftReferenceTest {
    public static void main(String[] args) {

    }

    @Test
    public void weakReference() {
        Object referent = new Object();
        WeakReference<Object> weakRerference = new WeakReference<Object>(referent);

        assertSame(referent, weakRerference.get());

        referent = null;
        System.gc();

        /**
         * 一旦没有指向 referent 的强引用, weak reference 在 GC 后会被自动回收
         */
        assertNull(weakRerference.get());
    }

    @Test
    public void softReference() {
        Object referent = new Object();
        SoftReference<Object> softRerference = new SoftReference<Object>(referent);

        assertNotNull(softRerference.get());

        referent = null;
        System.gc();

        /**
         *  soft references 只有在 jvm OutOfMemory 之前才会被回收, 所以它非常适合缓存应用
         */
        assertNotNull(softRerference.get());
    }

    @Test
    public void phantomReferenceAlwaysNull() {
        Object referent = new Object();
        PhantomReference<Object> phantomReference = new PhantomReference<Object>(referent, new ReferenceQueue<Object>());

        /**
         * phantom reference 的 get 方法永远返回 null
         */
        assertNull(phantomReference.get());
    }

    @Test
    public void referenceQueue() throws InterruptedException {
        Object referent = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        WeakReference<Object> weakReference = new WeakReference<Object>(referent, referenceQueue);

        assertFalse(weakReference.isEnqueued());
        Reference<? extends Object> polled = referenceQueue.poll();
        assertNull(polled);

        referent = null;
        System.gc();

        assertTrue(weakReference.isEnqueued());
        Reference<? extends Object> removed = referenceQueue.remove();
        assertNotNull(removed);
    }
}
