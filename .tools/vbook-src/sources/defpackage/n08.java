package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class n08 implements h08 {
    public static final j08 a;
    public static final /* synthetic */ n08[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j08] */
    static {
        ?? r0 = new n08() { // from class: j08
            @Override // defpackage.h08
            public final boolean apply(Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysTrue()";
            }
        };
        a = r0;
        b = new n08[]{r0, new n08() { // from class: k08
            @Override // defpackage.h08
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new n08() { // from class: l08
            @Override // defpackage.h08
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new n08() { // from class: m08
            @Override // defpackage.h08
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static n08 valueOf(String str) {
        return (n08) Enum.valueOf(n08.class, str);
    }

    public static n08[] values() {
        return (n08[]) b.clone();
    }
}
