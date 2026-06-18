package org.mozilla.javascript.ast;

import defpackage.ky0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class Label extends Jump {
    private String name;

    public Label(int i, int i2) {
        this.type = Token.LABEL;
        this.position = i;
        this.length = i2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        String strTrim = str == null ? null : str.trim();
        if (strTrim == null || "".equals(strTrim)) {
            gp.l("invalid label name");
        } else {
            this.name = strTrim;
        }
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        return ky0.s(this.name, ":\n", sb);
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public Label(int i) {
        this(i, -1);
    }

    public Label() {
        this.type = Token.LABEL;
    }

    public Label(int i, int i2, String str) {
        this(i, i2);
        setName(str);
    }
}
