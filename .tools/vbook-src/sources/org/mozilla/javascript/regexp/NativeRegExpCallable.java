package org.mozilla.javascript.regexp;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
class NativeRegExpCallable extends NativeRegExp implements Function {
    public NativeRegExpCallable(Scriptable scriptable, RECompiled rECompiled) {
        super(scriptable, rECompiled);
    }

    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return execSub(context, scriptable, objArr, 1);
    }

    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Constructable
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        return (Scriptable) execSub(context, scriptable, objArr, 1);
    }

    public NativeRegExpCallable() {
    }
}
