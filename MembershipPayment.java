/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author ilash
 */
private class MembershipPayment extends AgreementPayment {
    String status;
    String lastMatch;
    String nextExpiry;
    int durationToExpiry;
    int refundFlag;
}
