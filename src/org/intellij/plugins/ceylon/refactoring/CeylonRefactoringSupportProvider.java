package org.intellij.plugins.ceylon.refactoring;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import org.intellij.plugins.ceylon.codeInsight.resolve.IdentifiableStatement;
import org.jetbrains.annotations.NotNull;

public class CeylonRefactoringSupportProvider extends RefactoringSupportProvider {
    @Override
    public boolean isInplaceRenameAvailable(@NotNull PsiElement element, PsiElement context) {
        if (context != null && context.getContainingFile() != element.getContainingFile()) return false;

        if (!(element instanceof IdentifiableStatement)) {
            return false;
        }
        return true;
    }

}
