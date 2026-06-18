package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pr2 extends RuntimeException {
    public final il1 a;

    public pr2(il1 il1Var) {
        this.a = il1Var;
        if (il1Var.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, Token.IF, -127, 126665345, Context.VERSION_ES6};
        List list = il1Var.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            jl1 jl1Var = (jl1) list.get(i);
            if (!fw.N(jl1Var.a, iArr)) {
                if (jl1Var.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((jl1) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        fc1.M0(arrayList);
                    }
                } else {
                    arrayList.add(jl1Var);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((jl1) arrayList.get(i4)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        il1 il1Var = this.a;
        if (!il1Var.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        zy5 zy5VarN = gc1.N();
        List list = il1Var.a;
        list.getClass();
        i96 i96Var = new i96(list);
        int iA = i96Var.a();
        for (int i = 0; i < iA; i++) {
            ((jl1) i96Var.get(i)).getClass();
        }
        zy5 zy5VarJ = gc1.J(zy5VarN);
        zy5VarJ.getClass();
        i96 i96Var2 = new i96(zy5VarJ);
        int iA2 = i96Var2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) i96Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
