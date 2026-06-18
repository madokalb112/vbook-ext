package org.mozilla.javascript.ast;

import defpackage.ky0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class Yield extends AstNode {
    private AstNode value;

    public Yield(int i, int i2, AstNode astNode, boolean z) {
        super(i, i2);
        this.type = z ? Token.YIELD_STAR : 78;
        setValue(astNode);
    }

    public AstNode getValue() {
        return this.value;
    }

    public void setValue(AstNode astNode) {
        this.value = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        AstNode astNode = this.value;
        return astNode == null ? "yield" : ky0.r("yield ", astNode.toSource(0));
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        AstNode astNode;
        if (!nodeVisitor.visit(this) || (astNode = this.value) == null) {
            return;
        }
        astNode.visit(nodeVisitor);
    }

    public Yield(int i) {
        super(i);
        this.type = 78;
    }

    public Yield(int i, int i2) {
        super(i, i2);
        this.type = 78;
    }

    public Yield() {
        this.type = 78;
    }
}
