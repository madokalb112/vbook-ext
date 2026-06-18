package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class sp9 {
    public static final /* synthetic */ int a = 0;

    static {
        Object pm8Var;
        Object pm8Var2;
        Exception exc = new Exception();
        String simpleName = p7c.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            pm8Var = vc0.class.getCanonicalName();
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (qm8.a(pm8Var) != null) {
            pm8Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            pm8Var2 = sp9.class.getCanonicalName();
        } catch (Throwable th2) {
            pm8Var2 = new pm8(th2);
        }
        if (qm8.a(pm8Var2) != null) {
            pm8Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
