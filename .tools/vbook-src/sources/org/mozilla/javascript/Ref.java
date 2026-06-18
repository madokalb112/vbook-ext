package org.mozilla.javascript;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class Ref implements Serializable {
    private static final long serialVersionUID = 4044540354730911424L;

    public boolean delete(Context context) {
        return false;
    }

    public abstract Object get(Context context);

    public boolean has(Context context) {
        return true;
    }

    @Deprecated
    public abstract Object set(Context context, Object obj);

    public Object set(Context context, Scriptable scriptable, Object obj) {
        return set(context, obj);
    }
}
