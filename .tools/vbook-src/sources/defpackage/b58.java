package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class b58 extends ix0 implements ni5 {
    public final boolean a;

    public b58(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = (i & 2) == 2;
    }

    @Override // defpackage.ix0
    public final qh5 compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b58) {
            b58 b58Var = (b58) obj;
            return getOwner().equals(b58Var.getOwner()) && getName().equals(b58Var.getName()) && getSignature().equals(b58Var.getSignature()) && lc5.Q(getBoundReceiver(), b58Var.getBoundReceiver());
        }
        if (obj instanceof ni5) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.ix0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ni5 getReflected() {
        if (this.a) {
            sy3.p("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        qh5 qh5VarCompute = compute();
        if (qh5VarCompute != this) {
            return (ni5) qh5VarCompute;
        }
        throw new cy1("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        qh5 qh5VarCompute = compute();
        if (qh5VarCompute != this) {
            return qh5VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
