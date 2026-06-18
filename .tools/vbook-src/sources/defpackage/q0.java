package defpackage;

import java.util.function.Function;
import org.mozilla.javascript.AbstractEcmaObjectOperations;
import org.mozilla.javascript.NativeConsole;
import org.mozilla.javascript.NativeSymbol;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeDataView;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class q0 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ q0(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return AbstractEcmaObjectOperations.lambda$groupBy$0(obj);
            case 1:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 2:
                return NativeArrayBuffer.js_byteLength((Scriptable) obj);
            case 3:
                return NativeConsole.lambda$count$0((String) obj);
            case 4:
                return NativeDataView.lambda$init$0((Scriptable) obj);
            case 5:
                return NativeDataView.lambda$init$1((Scriptable) obj);
            case 6:
                return NativeDataView.lambda$init$2((Scriptable) obj);
            default:
                return NativeSymbol.js_description((Scriptable) obj);
        }
    }
}
