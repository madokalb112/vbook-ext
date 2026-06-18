package org.mozilla.javascript.ast;

import defpackage.j39;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ComputedPropertyKey extends AstNode {
    private AstNode expression;

    public ComputedPropertyKey(int i, int i2) {
        super(i, i2);
        this.type = Token.COMPUTED_PROPERTY;
    }

    public AstNode getExpression() {
        return this.expression;
    }

    @Override // org.mozilla.javascript.ast.AstNode, org.mozilla.javascript.Node
    public boolean hasSideEffects() {
        if (this.expression == null) {
            AstNode.codeBug();
        }
        return this.expression.hasSideEffects();
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return j39.A(makeIndent(i), "[", this.expression.toSource(i), "]");
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }
}
