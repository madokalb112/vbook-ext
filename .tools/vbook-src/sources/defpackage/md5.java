package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class md5 extends IdScriptableObject {
    public static final /* synthetic */ int b = 0;
    public final xd5 a;

    public md5(xd5 xd5Var) {
        this.a = xd5Var;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public final Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object objL;
        Object objP0;
        if (idFunctionObject == null || !idFunctionObject.hasTag("JSBridge")) {
            Object objExecIdCall = super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
            objExecIdCall.getClass();
            return objExecIdCall;
        }
        if (idFunctionObject.methodId() == 1) {
            ArrayList arrayList = new ArrayList();
            String strValueOf = "";
            if (objArr != null && (objP0 = fw.p0(0, objArr)) != null && (objP0 instanceof NativeArray)) {
                strValueOf = String.valueOf(fc1.A0(0, (List) objP0));
                int i = 0;
                for (Object obj : (Iterable) objP0) {
                    int i2 = i + 1;
                    if (i < 0) {
                        gc1.i0();
                        throw null;
                    }
                    if (i > 0) {
                        arrayList.add(Context.jsToJava(obj, Object.class));
                    }
                    i = i2;
                }
            }
            objL = this.a.l(strValueOf, arrayList.toArray(new Object[0]));
            if (objL == null) {
                objL = Undefined.instance;
            }
        } else {
            objL = Undefined.instance;
        }
        objL.getClass();
        return objL;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public final int findPrototypeId(String str) {
        return lc5.Q(str, "execFunction") ? 1 : 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public final String getClassName() {
        return "JSBridge";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public final void initPrototypeId(int i) {
        if (i == 1) {
            initPrototypeMethod("JSBridge", i, "execFunction", 1);
        }
    }
}
