package defpackage;

import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.ScriptRuntimeES6;
import org.mozilla.javascript.Scriptable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class b27 implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ b27(int i) {
        this.a = i;
    }

    @Override // org.mozilla.javascript.Callable
    public final Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        switch (this.a) {
            case 0:
                return NativeSymbol.js_valueOf(context, scriptable, scriptable2, objArr);
            default:
                return ScriptRuntimeES6.lambda$addSymbolSpecies$0(context, scriptable, scriptable2, objArr);
        }
    }
}
