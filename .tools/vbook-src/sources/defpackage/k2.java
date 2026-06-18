package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class k2 {
    public transient Collection a;
    public transient Set b;
    public transient Collection c;
    public transient Map d;

    public Map a() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapC = c();
        this.d = mapC;
        return mapC;
    }

    public abstract void b();

    public abstract Map c();

    public abstract Collection d();

    public abstract Set e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k2) {
            return a().equals(((k2) obj).a());
        }
        return false;
    }

    public abstract Iterator f();

    public boolean g(Object obj, Object obj2) {
        Collection collection = (Collection) a().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public abstract int h();

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
