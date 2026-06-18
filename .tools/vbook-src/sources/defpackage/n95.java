package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class n95 {
    public final if0 a;

    public n95(if0 if0Var) {
        this.a = if0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    public Object a(s16 s16Var) throws e20 {
        Iterable iterableY;
        zk4 zk4Var = (zk4) s16Var.b;
        if0 if0Var = this.a;
        if0Var.toString();
        zk4Var.getClass();
        yv5 yv5Var = yv5.e;
        yv5Var.compareTo(yv5.a);
        try {
            rm7 rm7Var = (rm7) s16Var.e;
            if (rm7Var == null) {
                rm7Var = new rm7(3, null);
            }
            return if0Var.c.invoke((ev8) s16Var.c, rm7Var);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e);
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            int i = 0;
            while (i < stackTrace.length) {
                String className = stackTrace[i].getClassName();
                className.getClass();
                if (bw9.O(className, "sun.reflect", false)) {
                    break;
                }
                i++;
            }
            if (i == 0) {
                iterableY = lc3.a;
            } else if (i != 1) {
                iterableY = Arrays.asList(fw.Z(stackTrace, 0, i));
                iterableY.getClass();
            } else {
                iterableY = gc1.Y(stackTrace[0]);
            }
            sb.append(fc1.D0(iterableY, "\n\t", null, null, null, 62));
            if0Var.toString();
            yv5Var.compareTo(yv5.d);
            throw new e20("Could not create instance for '" + if0Var + '\'', e);
        }
    }

    public abstract Object b(s16 s16Var);
}
