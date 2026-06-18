package org.mozilla.javascript;

import defpackage.k27;
import defpackage.w58;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.JavaAdapter;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ClassCache implements Serializable {
    private static final Object AKEY = "ClassCache";
    private static final long serialVersionUID = -8866246036237312215L;
    private Scriptable associatedScope;
    private volatile boolean cachingIsEnabled = true;
    private transient Map<JavaAdapter.JavaAdapterSignature, Class<?>> classAdapterCache;
    private transient Map<CacheKey, JavaMembers> classTable;
    private int generatedClassSerial;
    private transient Map<Class<?>, Object> interfaceAdapterCache;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static class CacheKey {
        final Class<?> cls;
        final Object sec;

        public CacheKey(Class<?> cls, Object obj) {
            this.cls = cls;
            this.sec = obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CacheKey)) {
                return false;
            }
            CacheKey cacheKey = (CacheKey) obj;
            return Objects.equals(this.cls, cacheKey.cls) && Objects.equals(this.sec, cacheKey.sec);
        }

        public int hashCode() {
            int iHashCode = this.cls.hashCode();
            Object obj = this.sec;
            return obj != null ? obj.hashCode() * 31 : iHashCode;
        }
    }

    public static ClassCache get(Scriptable scriptable) {
        ClassCache classCache = (ClassCache) ScriptableObject.getTopScopeValue(scriptable, AKEY);
        if (classCache != null) {
            return classCache;
        }
        k27.i("Can't find top level scope for ClassCache.get");
        return null;
    }

    public boolean associate(ScriptableObject scriptableObject) {
        if (scriptableObject.getParentScope() != null) {
            w58.p();
            return false;
        }
        if (this != scriptableObject.associateValue(AKEY, this)) {
            return false;
        }
        this.associatedScope = scriptableObject;
        return true;
    }

    public synchronized void cacheInterfaceAdapter(Class<?> cls, Object obj) {
        try {
            if (this.cachingIsEnabled) {
                if (this.interfaceAdapterCache == null) {
                    this.interfaceAdapterCache = new ConcurrentHashMap(16, 0.75f, 1);
                }
                this.interfaceAdapterCache.put(cls, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clearCaches() {
        this.classTable = null;
        this.classAdapterCache = null;
        this.interfaceAdapterCache = null;
    }

    public Scriptable getAssociatedScope() {
        return this.associatedScope;
    }

    public Map<CacheKey, JavaMembers> getClassCacheMap() {
        if (this.classTable == null) {
            this.classTable = new ConcurrentHashMap(16, 0.75f, 1);
        }
        return this.classTable;
    }

    public Object getInterfaceAdapter(Class<?> cls) {
        Map<Class<?>, Object> map = this.interfaceAdapterCache;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public Map<JavaAdapter.JavaAdapterSignature, Class<?>> getInterfaceAdapterCacheMap() {
        if (this.classAdapterCache == null) {
            this.classAdapterCache = new ConcurrentHashMap(16, 0.75f, 1);
        }
        return this.classAdapterCache;
    }

    public final boolean isCachingEnabled() {
        return this.cachingIsEnabled;
    }

    @Deprecated
    public boolean isInvokerOptimizationEnabled() {
        return false;
    }

    public final synchronized int newClassSerialNumber() {
        int i;
        i = this.generatedClassSerial + 1;
        this.generatedClassSerial = i;
        return i;
    }

    public synchronized void setCachingEnabled(boolean z) {
        try {
            if (z == this.cachingIsEnabled) {
                return;
            }
            if (!z) {
                clearCaches();
            }
            this.cachingIsEnabled = z;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public synchronized void setInvokerOptimizationEnabled(boolean z) {
    }
}
