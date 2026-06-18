package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qu3 extends dj0 {
    @Override // defpackage.dj0
    public final Map j() {
        return y86.V(super.j(), y86.P(new xl7("isEnumConstant", null), new xl7("isEnumConstantNot", null), new xl7("type", null), new xl7("typeCondition", null), new xl7("genericType", null), new xl7("genericTypeCondition", null)));
    }

    public final List q() throws NoSuchFieldException, NoSuchMethodException {
        ie6 ie6Var = (ie6) this.a;
        if (ie6Var == null) {
            gp.l("You must provide a configuration to resolve the member use build(configuration).");
            return null;
        }
        List listO = ne6.o(this, ie6Var, ie6Var.a, new yq3(18, this, ie6Var));
        listO.getClass();
        return listO;
    }
}
