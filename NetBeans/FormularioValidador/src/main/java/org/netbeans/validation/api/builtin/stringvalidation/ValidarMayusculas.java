/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.openide.util.NbBundle;

/**
 *
 * @author Sergio
 */
public class ValidarMayusculas extends StringValidator{

    @Override
    public void validate(Problems prblms, String campoName, String text) {
        if ((!"".equals(text) && !Character.isUpperCase(text.charAt(0)))){
            String msg = NbBundle.getMessage(this.getClass(), "MSG_MAYUSCULAS", campoName);
            prblms.add(msg);
        }
    }
    
}
