package org.mozilla.javascript.debug;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface DebugFrame {
    void onDebuggerStatement(Context context);

    void onEnter(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr);

    void onExceptionThrown(Context context, Throwable th);

    void onExit(Context context, boolean z, Object obj);

    void onLineChange(Context context, int i);
}
