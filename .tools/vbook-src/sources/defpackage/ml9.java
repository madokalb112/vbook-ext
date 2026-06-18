package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ml9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ml9(String str, String str2, String str3, String str4) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml9)) {
            return false;
        }
        ml9 ml9Var = (ml9) obj;
        if (!this.a.equals(ml9Var.a) || !this.b.equals(ml9Var.b) || !lc5.Q(this.c, ml9Var.c) || !this.d.equals(ml9Var.d)) {
            return false;
        }
        lc3 lc3Var = lc3.a;
        return lc3Var.equals(lc3Var);
    }

    public final int hashCode() {
        return ((this.d.hashCode() + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + 1;
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SourceComment(userName=", this.a, ", userAvatar=", this.b, ", content=");
        j39.y(sbQ, this.c, ", description=", this.d, ", subSourceComments=");
        sbQ.append(lc3.a);
        sbQ.append(")");
        return sbQ.toString();
    }
}
