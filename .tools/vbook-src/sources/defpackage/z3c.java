package defpackage;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z3c extends om8 implements yb4 {
    public int b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ c93 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3c(c93 c93Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = c93Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        z3c z3cVar = new z3c(this.f, jt1Var);
        z3cVar.e = obj;
        return z3cVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((z3c) create((b39) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int length;
        int i;
        Object gi8Var;
        Node node = (Node) ((gi8) this.f).a;
        b39 b39Var = (b39) this.e;
        int i2 = this.d;
        if (i2 == 0) {
            e11.e0(obj);
            length = node.getChildNodes().getLength();
            i = 0;
        } else {
            if (i2 != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.c;
            int i3 = this.b;
            e11.e0(obj);
            i = i3 + 1;
        }
        if (i >= length) {
            return heb.a;
        }
        node.getChildNodes().getLength();
        Node nodeItem = node.getChildNodes().item(i);
        if (nodeItem instanceof Element) {
            gi8Var = new c93((Element) nodeItem);
        } else {
            nodeItem.getClass();
            gi8Var = new gi8(nodeItem);
        }
        this.e = b39Var;
        this.b = i;
        this.c = length;
        this.d = 1;
        b39Var.e(this, gi8Var);
        return xx1.a;
    }
}
