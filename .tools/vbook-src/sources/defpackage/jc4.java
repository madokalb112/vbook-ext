package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class jc4 extends ix0 implements ic4, ei5 {
    private final int arity;

    public jc4(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.ix0
    public qh5 computeReflected() {
        ug8.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jc4) {
            jc4 jc4Var = (jc4) obj;
            return getName().equals(jc4Var.getName()) && getSignature().equals(jc4Var.getSignature()) && lc5.Q(getBoundReceiver(), jc4Var.getBoundReceiver()) && lc5.Q(getOwner(), jc4Var.getOwner());
        }
        if (obj instanceof ei5) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.ic4
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.ix0
    public ei5 getReflected() {
        qh5 qh5VarCompute = compute();
        if (qh5VarCompute != this) {
            return (ei5) qh5VarCompute;
        }
        throw new cy1("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.ei5
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.ei5
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.ei5
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.ei5
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.ei5
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        qh5 qh5VarCompute = compute();
        if (qh5VarCompute != this) {
            return qh5VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
