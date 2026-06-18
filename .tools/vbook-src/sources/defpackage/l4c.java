package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class l4c {
    public static final z55 a = new z55(null, null);
    public static final d6a b = new d6a(new ttb(6));

    public static final void a(Object obj, String str) {
        if (obj == null) {
            throw new d72(tw2.o("Can not create a ", str, " from the given input: the field ", str, " is missing"));
        }
    }
}
